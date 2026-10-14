import java.util.HashMap;

public class MainInventaris {
    public static void main(String[] args) {
        // 3. Menggunakan HashMap<String, Produk> sebagai storage utama
        HashMap<String, Produk> mapInventaris = new HashMap<>();

        // 4. Menambahkan minimal 5 produk ke dalam HashMap
        mapInventaris.put("P001", new Produk("P001", "Laptop Asus", 15));
        mapInventaris.put("P002", new Produk("P002", "Mouse Logitech", 40));
        mapInventaris.put("P003", new Produk("P003", "Keyboard Mechanical", 25));
        mapInventaris.put("P004", new Produk("P004", "Monitor LG 24 inch", 10));
        mapInventaris.put("P005", new Produk("P005", "Headset Gaming", 30));

        // 6. Simulasi alur: Cetak daftar awal
        System.out.println("=== DAFTAR INVENTARIS AWAL ===");
        int totalStokAwal = 0;
        
        // 5. Iterasi dengan For-Each
        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);
            p.tampilkanInfo();
            totalStokAwal += p.getStok();
        }
        System.out.println("Total Keseluruhan Stok: " + totalStokAwal);
        System.out.println("--------------------------------------------------");

        // 6. Simulasi ubah stok via .get(kode).setStok()
        String kodeUpdate = "P002";
        if (mapInventaris.containsKey(kodeUpdate)) {
            mapInventaris.get(kodeUpdate).setStok(55);
            System.out.println("-> Stok produk " + kodeUpdate + " berhasil diubah menjadi 55.\n");
        }

        // 6. Simulasi hapus satu produk via .remove(kode)
        String kodeHapus = "P005";
        if (mapInventaris.containsKey(kodeHapus)) {
            mapInventaris.remove(kodeHapus);
            System.out.println("-> Produk dengan kode " + kodeHapus + " telah dihapus dari inventaris.\n");
        }

        // 6. Simulasi alur: Cetak daftar akhir
        System.out.println("=== DAFTAR INVENTARIS AKHIR ===");
        int totalStokAkhir = 0;
        
        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);
            System.out.println(p.getNama() + " | Stok: " + p.getStok());
            totalStokAkhir += p.getStok();
        }
        System.out.println("Total Keseluruhan Stok Akhir: " + totalStokAkhir);
    }
}