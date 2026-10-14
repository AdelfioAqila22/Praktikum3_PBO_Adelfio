# Sistem Informasi Inventaris Barang 

Mini project sederhana berbasis Java untuk memenuhi tugas Praktikum **Pemrograman Berbasis Objek (PBO)** Pertemuan 4 mengenai **Array & Java Collections Framework (ArrayList & HashMap)**.

## Fitur Utama
- **Object-Oriented Programming (OOP):** Menerapkan *Encapsulation* (atribut private), *Constructor*, serta *Getter/Setter* pada class `Produk`.
- **Java Collections Framework (`HashMap`):** Menggunakan `HashMap<String, Produk>` sebagai penyimpanan utama agar pencarian data (*lookup*) berdasarkan kode produk menjadi sangat cepat $O(1)$.
- **Enhanced For-Loop:** Menggunakan pola iterasi modern `for (String key : mapInventaris.keySet())` untuk membaca seluruh data inventaris secara ringkas dan aman.
- **Simulasi Manajemen Stok:** 
  - Menampilkan daftar produk awal beserta akumulasi total stok keseluruhan.
  - Mengubah jumlah stok produk tertentu menggunakan method `.get(kode).setStok()`.
  - Menghapus produk dari inventaris menggunakan method `.remove(kode)`.
  - Menampilkan daftar inventaris akhir setelah pembaruan.

---

## Struktur Project
Project ini terdiri dari 2 file utama kode sumber Java:
1. **`Produk.java`** — Class blueprint objek yang merepresentasikan data sebuah produk (Kode, Nama, dan Stok).
2. **`MainInventaris.java`** — Class utama tempat program dieksekusi, berisi inisialisasi data, iterasi, manipulasi stok, dan penghapusan data.

---

## Cara Menjalankan Program

1. **Clone repository ini atau unduh filenya:**
   ```bash
   git clone https://github.com/AdelfioAqila22/Praktikum3_PBO_Adelfio.git
