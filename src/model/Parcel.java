package model;

import java.util.Objects;

public final class Parcel {
    private final String id;
    private final int weight;
    private final int length;
    private final int width;
    private final int height;
    private final int depotDays;
    private boolean collected;

    public Parcel(String id, int weight, int length, int width, int height, int depotDays) {
        this.id = id;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.depotDays = depotDays;
        this.collected = false; // Default to not collected
    }

    public void setCollected(boolean collected) {
        this.collected = collected;
    }

    public boolean isCollected() {
        return collected;
    }

    public int getDepotDays() {
        return depotDays;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Parcel parcel = (Parcel) obj;
        return weight == parcel.weight &&
                length == parcel.length &&
                width == parcel.width &&
                height == parcel.height &&
                depotDays == parcel.depotDays &&
                collected == parcel.collected &&
                Objects.equals(id, parcel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weight, length, width, height, depotDays, collected);
    }

    @Override
    public String toString() {
        return
                "id=" + id + ", " +
                        "weight=" + weight + ", " +
                        "length=" + length + ", " +
                        "width=" + width + ", " +
                        "height=" + height + ", " +
                        "depotDays=" + depotDays + ", " +
                        "collected=" + collected ;
    }
}
