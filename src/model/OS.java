package model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by shrralis on 2/19/17.
 */
public class OS extends Owner {
    @SuppressWarnings("unused")
    public OS() {}

    public OS(ResultSet from) throws SQLException {
        parse(from);
    }
    @Override
    public OS parse(ResultSet from) throws SQLException {
        super.parse(from);
        return this;
    }
}
