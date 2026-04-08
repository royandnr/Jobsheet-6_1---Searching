Jawaban 6.2.3.

1. Method tampilPosisi digunakan untuk menampilkan posisi atau indeks dari data mahasiswa yang ditemukan berdasarkan hasil pencarian. Jika data ditemukan, maka akan ditampilkan indeksnya, sedangkan jika tidak ditemukan akan muncul pesan bahwa data tidak ada.
Method tampilDataSearch digunakan untuk menampilkan detail lengkap data mahasiswa yang ditemukan, seperti NIM, nama, kelas, dan IPK.

2. untuk menghentikan proses perulangan (loop) ketika data yang dicari sudah ditemukan.

3. Variabel pos berfungsi sebagai penyimpan hasil indeks atau posisi data yang ditemukan selama proses pencarian.

4. Jika terdapat lebih dari satu data dengan nilai IPK yang sama, maka hasil pencarian sequential search hanya akan menampilkan data pertama yang ditemukan.

5. ika perintah break dihapus dari kode, maka proses perulangan akan tetap berjalan hingga seluruh data selesai diperiksa.

Akibatnya, jika terdapat beberapa data dengan nilai yang sama, maka variabel posisi akan terus diperbarui dan akhirnya menyimpan posisi data terakhir yang ditemukan, bukan yang pertama.
