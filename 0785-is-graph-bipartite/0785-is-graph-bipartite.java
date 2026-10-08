// Java

class Solution {
    public boolean isBipartite(int[][] graph) {

        // 0 -> Not visited
        // 1 -> Blue
        // 2 -> Red
        int[] color = new int[graph.length];

        // Graph can be disconnected,
        // so check every component.
        for (int i = 0; i < graph.length; i++) {

            if (color[i] == 0) {
                if (!bfsColoring(graph, i, color)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean bfsColoring(
        int[][] graph,
        int start,
        int[] color
    ) {

        Queue<Integer> q = new LinkedList<>();

        // Assign first color
        color[start] = 1;
        q.offer(start);

        while (!q.isEmpty()) {

            int curr = q.poll();

            for (int next : graph[curr]) {

                // Adjacent nodes have the same color
                if (color[next] == color[curr]) {
                    return false;
                }

                // Not visited
                else if (color[next] == 0) {

                    // Assign opposite color
                    if (color[curr] == 1) {
                        color[next] = 2;
                    } else {
                        color[next] = 1;
                    }

                    q.offer(next);
                }
            }
        }

        return true;
    }
}