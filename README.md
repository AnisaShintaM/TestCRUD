# TestCRUD

 **JUDUL PROJECT** <br>
*Modul 10-1* <br>
Test CRUD <br>


 **SCREEN SHOOT** <br>
*Screen Shoot Login* <br>
![Screenshot 1] (https://s16.postimg.org/w4n7g5vph/image.jpg)
![Screenshot 2] (https://s18.postimg.org/xa9vxssjt/image.jpg)
![Screenshot 3] (https://s14.postimg.org/pj7e0ia9d/image.jpg)
![Screenshot 4] (https://s9.postimg.org/eda1044v3/image.jpg)

**Screen Shoot Tampilan** <br>
*Tampilan Awal*
![Screenshot 1] (https://s14.postimg.org/chokgwb9t/1_default.jpg)
*Insert data Anisa ke database tetapi belum dilengkapi form isiannya*
![Screenshot 2] (https://s23.postimg.org/m9dx0q1mj/2_gaklengkap.jpg)
*Berhasil menyimpan ke database*
![Screenshot 2] (https://s17.postimg.org/u49mfpp4v/3_bisanyimpan.jpg)
*Tampilan data dari databse ke table*
![Screenshot 2] (https://s9.postimg.org/4kra0psn3/4_hasilsimpanan.jpg)
*Melakukan aksi terhadap button delete tanpa memilih baris*
![Screenshot 3] (https://s29.postimg.org/l1s7xlifb/5_buttondelblmdipilih.jpg)
*Delete data*
![Screenshot 4] (https://s28.postimg.org/b6h84qhsd/6_sayapilih.jpg)
![Screenshot 4] (https://s18.postimg.org/bl0xmtamh/7_bisadihapus.jpg)

*Data Kau berhasil di delete. Dengan menekan button refresh maka akan tampil pembaharuan yang ada*
![Screenshot 5] (https://s9.postimg.org/8xs47qbf3/8_hasilhapusan.jpg)

*Aksi terhadap button clear*
![Screenshot 6] (https://s12.postimg.org/mcu3aeenh/9_buttonclear.jpg)

*Update data Anisa berhasil*
![Screenshot 9] (https://s10.postimg.org/xbcr8ldih/11_buttoneditnyabisa.jpg)
*Hasil akhir*
![Screenshot 8] (https://s21.postimg.org/z64fqua13/13_hasileditan.jpg)

*Button Print*
![Screenshot 8] (https://s11.postimg.org/uakiglarn/14_print.jpg)

**Screen Shoot Database Siswa** <br>

![Screenshot 1] (https://s14.postimg.org/loyxy63z5/Captureef.jpg)<br>


**Screen Shoot Database Akun** <br>
*Akun awal sebelum user Icha melakukan sign up* <br>
![Screenshot 1] (https://s23.postimg.org/xry8siju3/db4_akun_awal.jpg)<br>
*Ketikan user icha melakukan sign up* <br>
![Screenshot 2] (https://s16.postimg.org/x595t87f9/db5_ada_ica.jpg)<br>

**Penjelasan** <br>
Sebagai langkah awal dalam pengerjaan projek, kita harus menambahkan driver sebagai konektor antara Java dengan MySQL. Pada folder kibraries yang merupakan bahawan dari project kita klik kanan dan pilih Add Library - My SQL JBDC Driver - Add Library. Dengan hal itu maka project kita dapat terhubung dengan MySQL.
Kemudian, hal terpenting selanjutnya adalah adanya database yang terdiri atas 2 tabel di dalamnya. Tabel pertama yakni tb_akun akan menyimpan data (username dan password) dari admin, sementara tabel kedua yakni t_siswa akan menyimpan 6 variable data siswam, artinya akan ada pula 6 columns untuk menyimpan masing - masing data siswa.
Ada 2 frame from yang akan ditampilkan yakni Main Frame dan Login Frame. Selain itu juga terdapat 3 file java sebagai koneksi dengan database. Pada Main Frame terdapat 8 variable dan 6 button. Dari inputan user pada text field dari masing - masing variable tersebut akan di distribusikan ke database yang telah di buat. 
Jangan lupa untuk menginclude-kan itextpdf agar kita dapat melakukan perintah print, dan jcalender untuk menampilkan waktu dan tanggal saat ini.

- Button save akan berfungsi sebagai insert data. Data yang di inputkan oleh user melalui text field akan masuk ke dalam database jika user menekan button save. Apabila format yang diinputkan oleh user salah maka akan ada message dialog berupa peringatan bahwa Data belum valid.
- Button delete akan berfungsi untuk menghapus data siswa pada field dari database tersebut. Ketika user memilih sebuah baris dan menekan button delete, maka data dari siswa tersebut akan hilang dari field pada database. Sementara jika belum memilih kolom maka akan ada message dialog sebagai peringatan bahwa kita harus memilih baris terlebih dahulu untuk dapat menghapus data
- Button clear berfungsi untuk membersihkan isian dari text field
- Button refresh berfungsi untuk menyegarkan / memberikan pembaharuan terhadap data yang tampil di tabel 
- Button edit berfungsi untuk melakukan pengeditan / updatedata dari siswa. Apabila user sudah memilih baris dari data dirinya, kemudian data tersebut akan ditampilkan di text field dari masing-masing variable tersebut. User dapat melakukan pembaharuan data disini, kemudian dengan menekan tombol edit maka data user akan diperbarui, baik di database maupun di tabel yang nampak <br>
-  Button print berfungsi untuk menyediakan pilihan apabila user ingin melakukan cetak pada data tersebut


*LOGIN*
Terdapat 3 button yakni button sign up, sign in, dan exit
User akan melakukan sign up apabila mereka baru pertama kali masuk, button sign in apabila sudah pernah melakukan pendaftaran dan berhasil. 
- Button sign up akan berfungsi ketika seseorang memasukkan username dan password dan menekan tombol sign up maka data yang berupa username dan password tersebut akan masuk ke dalam t_akun. 
- Button sign in akan berfungsi ketika seseorang memasukkan username dan password yang benar dan terdapat di database pada t_akun. Apabila tidak ada pada database table akun maka ada message dialog bahwa data salah


**IDENTIAS** <br>
 *Nama*          : Annisa Shinta Mahgfiroh <br>
 *Kelas*         : XI RPL 1 <br>
 *No Abs*        : 01 <br>
 *NIS*           : 4665/1384.07 <br>
 *NAMA SEKOLAH*  : SMK TELKOM MALANG <br>
