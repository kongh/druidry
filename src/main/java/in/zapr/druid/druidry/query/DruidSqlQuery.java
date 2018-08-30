package in.zapr.druid.druidry.query;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DruidSqlQuery {

    @NonNull
    protected String query;

    protected SqlContext context;

    @Builder
    public DruidSqlQuery(@NonNull String query,
                         SqlContext context) {
        this.query = query;
        this.context = context;
    }
}
