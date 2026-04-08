Jawaban 6.3.3.

1. int mid = (left + right) / 2;

2. if (listMhs[mid].ipk > cari) {
    return FindBinarySearch(cari, left, mid - 1);
} else if (listMhs[mid].ipk < cari) {
    return FindBinarySearch(cari, mid + 1, right);
}

3. left : menunjukkan batas kiri (awal) dari array atau sub-array yang sedang dicari
right : menunjukkan batas kanan (akhir) dari array atau sub-array
mid : posisi tengah dari array, digunakan untuk membandingkan data yang dicari

4. Program tetap dapat dijalankan, tetapi hasil binary search tidak akan akurat.
Hal ini karena binary search hanya bekerja dengan benar jika data dalam keadaan terurut (ascending atau descending). Jika data tidak urut, maka pembagian data menjadi dua bagian tidak valid sehingga hasil pencarian bisa salah atau tidak ditemukan.

5. Jika menggunakan binary search biasa (yang mengasumsikan ascending), maka hasilnya bisa:
tidak ditemukan, atau posisi salah

jadi hasilnya tidak sesuai

6. Binary search menentukan data tidak ditemukan ketika nilai left sudah lebih besar dari right

7. 