package response;

import model.QueryResult;

import java.util.List;

public class QueryStateResponse {
    private List<QueryResult> QueryResult;

    public List<model.QueryResult> getQueryResult() {
        return QueryResult;
    }

    public void setQueryResult(List<model.QueryResult> queryResult) {
        QueryResult = queryResult;
    }

}
