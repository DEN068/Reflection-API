public class QueryBuilder {
    private String table;

    public QueryBuilder(String table) {
        this.table = table;
    }

    public String deleteById(int id) {
        return "DELETE FROM " + table + " WHERE ID = '" + id + "'";
    }
}