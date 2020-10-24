/**
 * @author Ayomide Oyekanmi
 */
class EdgeListGraph {
    private List<int[]> graph;

    public EdgeListGraph() {
        graph = new ArrayList<>();
    }

    /**
     * 
     */
    public boolean hasEdge(int v1, int v2){
        for(int[] edge : graph){
            if (edge[0] == v1 && edge[1] == v2){
                return true;
            }

            if (edge[0] == v2 && edge[1] == v1){
                return true;
            }
        }

        return false;
    }

    /**
     * 
     */
    public List<Integer> findNeighbours(int v){
        List<Integer> neighbours = new ArrayList<>();

        for(int[] edge : graph){
            if (edge[0] == v){
                neighbours.add(edge[1]);
            }

            if (edge[1] == v){
                neighbours.add(edge[0]);
            }
        }

        return neighbours;
    }
}