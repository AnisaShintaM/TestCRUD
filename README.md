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
![Screenshot 1] (https://s28.postimg.org/3zlxmv2xp/image.jpg)
*Insert data Anisa ke database*
![Screenshot 2] (https://s9.postimg.org/j9tqlyyq7/image.jpg)
*Tampilan data dari databse ke table*
![Screenshot 2] (https://s32.postimg.org/zawrpzxlh/image.jpg)
*Melakukan aksi terhadap button delete tanpa memilih baris*
![Screenshot 3] (https://s8.postimg.org/b9jc5kob9/image.jpg)
*Delete data*
![Screenshot 4] (https://s22.postimg.org/mvnvpnfup/image.jpg)
*Data Anisa berhasil di delete. Dengan menekan button refresh maka akan tampil pembaharuan yang ada*
![Screenshot 5] (https://s22.postimg.org/6yy3y0o69/4_refresh.jpg)
*Aksi terhadap button clear*
![Screenshot 6] (https://s21.postimg.org/eoprzlcdj/image.jpg)
*Melakukan aksi terhadap button edit tanpa memilih baris*
![Screenshot 7] (https://s21.postimg.org/e54p7ho13/image.jpg)
*Melakukan update data Zidan*
![Screenshot 8] (https://s9.postimg.org/u6t4nr6kf/image.jpg)
*Update data Zidan berhasil*
![Screenshot 9] (https://s10.postimg.org/btcd7p5m1/image.jpg)
*Hasil akhir*
![Screenshot 8] (https://s23.postimg.org/v5jlk4c17/image.jpg)

**Screen Shoot Database Siswa** <br>
*Insert data Anisa di database* <br>
![Screenshot 1] (https://s10.postimg.org/d8eodfyft/db1.jpg)<br>
*Delete data Anisa di database* <br>
![Screenshot 2] (https://s27.postimg.org/56qwr6nir/db2_setelah_anisa_dihapus.jpg)<br>
*Update data Zidan ke di database* <br>
![Screenshot 3] (https://s9.postimg.org/79w39kte7/db3_zidan_baru.jpg)<br>

**Screen Shoot Database Akun** <br>
*Akun awal sebelum user Icha melakukan sign up* <br>
![Screenshot 1] (https://s23.postimg.org/xry8siju3/db4_akun_awal.jpg)<br>
*Ketikan user icha melakukan sign up* <br>
![Screenshot 2] (https://s16.postimg.org/x595t87f9/db5_ada_ica.jpg)<br>

**Penjelasan** <br>
Sebagai langkah awal dalam pengerjaan projek, kita harus menambahkan driver sebagai konektor antara Java dengan MySQL. Pada folder kibraries yang merupakan bahawan dari project kita klik kanan dan pilih Add Library - My SQL JBDC Driver - Add Library. Dengan hal itu maka project kita dapat terhubung dengan MySQL.
Kemudian, hal terpenting selanjutnya adalah adanya database yang terdiri atas 2 tabel di dalamnya. Tabel pertama yakni tb_akun akan menyimpan data (username dan password) dari admin, sementara tabel kedua yakni t_siswa akan menyimpan 6 variable data siswam, artinya akan ada pula 6 columns untuk menyimpan masing - masing data siswa.
Ada 2 frame from yang akan ditampilkan yakni Main Frame dan Login Frame. Selain itu juga terdapat 3 file java sebagai koneksi dengan database. Pada Main Frame terdapat 6 variable dan 5 button. Dari inputan user pada text field dari masing - masing variable tersebut akan di distribusikan ke database yang telah di buat. 

- Button save akan berfungsi sebagai insert data. Data yang di inputkan oleh user melalui text field akan masuk ke dalam database jika user menekan button save. Apabila format yang diinputkan oleh user salah maka akan ada message dialog berupa peringatan bahwa Data belum valid.
- Button delete akan berfungsi untuk menghapus data siswa pada field dari database tersebut. Ketika user memilih sebuah baris dan menekan button delete, maka data dari siswa tersebut akan hilang dari field pada database. Sementara jika belum memilih kolom maka akan ada message dialog sebagai peringatan bahwa kita harus memilih baris terlebih dahulu untuk dapat menghapus data
- Button clear berfungsi untuk membersihkan isian dari text field
- Button refresh berfungsi untuk menyegarkan / memberikan pembaharuan terhadap data yang tampil di tabel 
- Button edit berfungsi untuk melakukan pengeditan / updatedata dari siswa. Apabila user sudah memilih baris dari data dirinya, kemudian data tersebut akan ditampilkan di text field dari masing-masing variable tersebut. User dapat melakukan pembaharuan data disini, kemudian dengan menekan tombol edit maka data user akan diperbarui, baik di database maupun di tabel yang nampak <br>


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
