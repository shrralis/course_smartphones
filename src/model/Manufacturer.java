package model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by shrralis on 2/19/17.
 */
public class Manufacturer extends Owner {
    String country = null;

    @SuppressWarnings("unused")
    public Manufacturer() {}

    public Manufacturer(ResultSet from) {
        parse(from);
    }
    @Override
    public Manufacturer parse(ResultSet from) {
        super.parse(from);

        try {
            country = from.getString("country");
        } catch (SQLException ignored) {}
        return this;
    }
}
