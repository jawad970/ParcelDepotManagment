package model;

import java.util.Objects;
import java.util.UUID;

public final class Customer {
    private final String id;
    private final String name;
    private final String parcelID;

    public Customer(String name, String parcelID) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.parcelID = parcelID;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String parcelID() {
        return parcelID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Customer) obj;
        return this.id == that.id &&
                Objects.equals(this.name, that.name) &&
                Objects.equals(this.parcelID, that.parcelID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, parcelID);
    }

    @Override
    public String toString() {
        return "Customer[" +
                "id=" + id + ", " +
                "name=" + name + ", " +
                "parcelID=" + parcelID + ']';
    }

}
