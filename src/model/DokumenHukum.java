package model;

public interface DokumenHukum {

    void tampilkanRingkasan();
    String getKategoriHukuman();

    default boolean apakahValid() {
        return getKategoriHukuman() != null && !getKategoriHukuman().isEmpty();
    }
}

