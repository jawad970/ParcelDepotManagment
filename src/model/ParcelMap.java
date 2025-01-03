package model;

import java.util.HashMap;
import java.util.Map;

public class ParcelMap {
    private final Map<String, Parcel> customerParcelMap;

    public ParcelMap() {
        customerParcelMap = new HashMap<>();
    }

    public boolean addParcel(Parcel parcel) {
        return customerParcelMap.put( parcel.getId(),parcel) == null;
    }

    public Parcel getParcel(String id) {
        return customerParcelMap.get(id);
    }

    public Map<String, Parcel> getAllParcels() {
        return Map.copyOf(customerParcelMap);
    }
}
