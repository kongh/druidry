package in.zapr.druid.druidry.query;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NonNull;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DruidSqlQuery {

    @NonNull
    protected String query;

    protected SqlContext context;
}
