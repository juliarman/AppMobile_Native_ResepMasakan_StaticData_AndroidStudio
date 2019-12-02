package com.juliarmanumar.resepmasakan;

import java.util.ArrayList;

public class DataResep {


    private static String[] bahanresep ={
            "<h3>Bahan-bahan:</h3>\n" +
                    "<ul>\n" +
                    "<li>4 potong ayam</li>\n" +
                    "<li>1 kotak Tahu Putih</li>\n" +
                    "<li>1 liter Air</li>\n" +
                    "<li>200 ml Santan</li>\n" +
                    "<li>1 btg Serai</li>\n" +
                    "<li>1 ruas Lengkuas</li>\n" +
                    "<li>3 lbr Daun Jeruk</li>\n" +
                    "<li>3 lbr Daun Salam</li>\n" +
                    "<li>2 btr Kapulaga</li>\n" +
                    "<li>2 btr Cengkeh</li>\n" +
                    "<li>2 sdt Garam</li>\n" +
                    "<li>1 sdt Lada Putih</li>\n" +
                    "<li>Ketupat secukupnya</li>\n" +
                    "</ul>\n" +
                    "\n" +
                    "<h3>Bumbu halus: </h3>\n" +
                    "<ul>\n" +
                    "<li>7 siung Bawang Merah</li>\n" +
                    "<li>10 siung Bawang Putih</li>\n" +
                    "<li>2 bh Cabe Merah</li>\n" +
                    "<li>3 btr Kemiri</li>\n" +
                    "<li>2 cm Jahe</li>\n" +
                    "<li>2 cm Kunyit</li>\n" +
                    "<li>1 sdt Ketumbar</li>\n" +
                    "<li>½ sdt Jintan</li>\n" +
                    "<li>Minyak secukupnya</li>\n" +
                    "</ul>\n",



            "<h3>Bahan yang disiapkan:</h3>\n" +
                    "<ul>\n" +
                    "<li>1 ekor Ayam</li>\n" +
                    "<li>3 lembar daun salam</li>\n" +
                    "<li>2 serai, geprek</li>\n" +
                    "<li>Sejempol Lengkuas, geprek</li>\n" +
                    "<li>750ml air atau secukupnya</li>\n" +
                    "<li>1 ikat kemangi, ambil daunnya (bisa skip) </li>\n" +
                    "<li>Garam</li>\n" +
                    "<li>Gula</li>\n" +
                    "</ul>\t\n" +
                    "\n" +
                    "\n" +
                    "<h3>Bumbu yang dihaluskan:</h3>\n" +
                    "<li> 8 Cabe Merah besar</li>\n" +
                    "<li> 8 Cabe Merah keriting</li>\n" +
                    "<li> Cabe rawit (bisa skip atau sesuai selera) </li>\n" +
                    "<li> 8 Bawang Merah</li>\n" +
                    "<li> 3 bawang Putih</li>\n" +
                    "<li> 3 Kemiri</li>\n" +
                    "<li> 1 cm jahe</li>\n" +
                    "<li> 1 sdt Kunyit bubuk</li>\n",



            "<h3>Bahan pertama: </h3>\n" +
                    "<ul>\n" +
                    "<li>200 gr cumi, potong panjang</li>\n" +
                    "<li>1 sdm air kapur sirih</li>\n" +
                    "</ul>\n" +
                    "<h3>Bahan kedua: </h3>\n" +
                    "<ul>\n" +
                    "<li>2 butir bawang putih, haluskan</li>\n" +
                    "<li>3/4 sdt garam</li>\n" +
                    "<li>1/4 sdt penyedap</li>\n" +
                    "<li>2 sdm tepung terigu</li>\n" +
                    "</ul>\n" +
                    "<h3>Bahan ketiga:</h3>\n" +
                    "<ul>\n" +
                    "<li>75 gr havermout instan</li>\n" +
                    "<li>Minyak untuk menggoreng</li>\n" +
                    "</ul>",



            "<h3>Bahan yang disiapkan: </h3>\n" +
                    "<ul>\n" +
                    "<li>500 gr ceker ayam</li>\n" +
                    "<li>1 sdt garam</li>\n" +
                    "<li>2 ruas jahe, memarkan</li>\n" +
                    "<li>Air secukupnya untuk merebus ceker</li>\n" +
                    "<ul>\n" +
                    "<h3>Bumbu cemplung: </h3>\n" +
                    "<ul>\n" +
                    "<li>5 lembar daun jeruk, buang tulangnya sobek kasar</li>\n" +
                    "<li>1 buah jeruk limau, ambil airnya</li>\n" +
                    "<li>Garam dan gula secukupnya</li>\n" +
                    "<li>1/2 sdt kaldu jamur</li>\n" +
                    "<li>7 cabai rawit utuh (sesuai selera) </li>\n" +
                    "<li>Cabai keriting merah dan hijau rajang (sesuai selera)</li>\n" +
                    "</ul>\n",




            "<h3>Bahan-bahan:</h3>\n" +
                    "<ul>\n" +
                    "<li>50 gram mentega</li>\n" +
                    "<li>1/2 kaleng susu kental manis</li>\n" +
                    "<li>35 gram gula palem</li>\n" +
                    "<li>1/2 cup kismis</li>\n" +
                    "<li>200 gram biskuit marie</li>\n" +
                    "<li>20 gram santan instan bubuk</li>\n" +
                    "<li>choco chips secukupnya</li>\n" +
                    "</ul>\n",




            "<h3>Bahan pertama: </h3>\n" +
                    "<ul>\n" +
                    "<li>150 ml susu cair hangat</li>\n" +
                    "<li>1 sdt ragi instan</li>\n" +
                    "<li>1 sdt gula pasir</li>\n" +
                    "</ul>\n" +
                    "<h3>Bahan kedua: </h3>\n" +
                    "<ul>\n" +
                    "<li>250 gram tepung terigu</li>\n" +
                    "<li>1 butir telur (kocok) </li>\n" +
                    "<li>1/2 sdt garam</li>\n" +
                    "<li>1 sdm gula halus</li>\n" +
                    "<li>1 sdm margarin</li>\n" +
                    "<li>1 sdt bread softener</li>\n" +
                    "</ul>\n" +
                    "<h3>Bahan topping: </h3>\n" +
                    "<ul>\n" +
                    "<li>6 buah sosis ayam (iris menjadi dua bagian) </li>\n" +
                    "<li>300 gram keju cheddar (parut) </li>\n" +
                    "<li>6 sdm saus sambal</li>\n" +
                    "<li>1 buah bawang bombay (iris tipis) </li>\n" +
                    "<li>6 sdm mayones</li>\n" +
                    "</ul>\n",





            "<h3>Bahan pertama: </h3>\n" +
                    "<ul>\n" +
                    " <li>250 gram tepung terigu</li>\n" +
                    "<li>1 sdm gula</li>\n" +
                    "<li>1 sdm susu bubuk vanila</li>\n" +
                    "<li>1 sdt ragi instan</li>\n" +
                    "<li>1 butir kuning telur</li>\n" +
                    "<li>air dingin secukupnya</li>\n" +
                    "</ul>\n" +
                    "<h3>Bahan kedua:</h3>\n" +
                    "<ul>\n" +
                    "<li>1 sdm mentega</li>\n" +
                    "<li>1/2 sdt garam</li>\n" +
                    "</ul>\n" +
                    "<h3>Bahan topping: </h3>\n" +
                    "<ul>\n" +
                    "<li>mayones secukupnya</li>\n" +
                    "<li>abon sapi secukupnya</li>\n" +
                    "</ul>\n",





            "<h3>Bahan-bahan:</h3>\n" +
                    "<ul>\n" +
                    "<li>245 gram tepung campuran (200 gram tepung cakra + 45 gram tepung segitiga)</li>\n" +
                    "<li>15 gram susu bubuk</li>\n" +
                    "<li>36 gram gula pasir</li>\n" +
                    "<li>6 gram ragi</li>\n" +
                    "<li>180 ml campuran adonan (1 butir telur + 20 gram whipped cream bubuk + susu cair, lalu aduk rata)</li>\n" +
                    "<li>30 gram mentega</li>\n" +
                    "<li>2 gram garam</li>\n" +
                    "</ul>\n" +
                    "\n" +
                    "\n" +
                    "<h3>Bahan topping:</h3>\n" +
                    "<ul>\n" +
                    "<li>2 buah sosis (potong dadu kecil)</li>\n" +
                    "<li>2 lembar smoked beef (potong memanjang)</li>\n" +
                    "<li>keju cheddar secukupnya (parut)</li>\n" +
                    "<li>saus tomat secukupnya</li>\n" +
                    "<li>oregano secukupnya</li>\n" +
                    "<li>mayones secukupnya</li>\n" +
                    "<li>1 butir kocokan kuning telur</li>\n" +
                    "</ul>",






            "<h3>Bahan-bahan:</h3>\n" +
                    "<ul>\n" +
                    "<li>1-2 saset serbuk minuman instan rasa green tea</li>\n" +
                    "<li>200 ml susu cair full cream</li>\n" +
                    "<li>Es batu secukupnya</li>\n" +
                    "<li>Air secukupnya</li>\n" +
                    "</ul>",






            "<h3>Bahan-bahan</h3>\n" +
                    "<ul>\n" +
                    "<li>2 kantong teh celup (bisa diganti 2 sendok makan penuh daun teh)</li>\n" +
                    "<li>3-4 sendok makan kental manis</li>\n" +
                    "<li>100 ml susu cair full cream</li>\n" +
                    "<li>Air secukupnya</li>\n" +
                    "<li>Es batu secukupnya</li>\n" +
                    "</ul>",




            "<h3>Bahan-bahan</h3>\n" +
                    "<ul>\n" +
                    "<li>200-250 ml susu cair full cream</li>\n" +
                    "<li>4-5 keping biskuit marie regal</li>\n" +
                    "<li>Es batu secukupnya</li>\n" +
                    "<li>Gula cair (jika ingin lebih manis)</li>\n" +
                    "<li>1 sendok teh Esens rhum </li>\n" +
                    "<ul>",




            "<h3>Bahan-bahan</h3>\n" +
                    "<ul>\n" +
                    "<li>250 ml susu cair full cream</li>\n" +
                    "<li>2-3 keping gula aren</li>\n" +
                    "<li>Boba kering instan secukupnya</li>\n" +
                    "<li>Air secukupnya</li>\n" +
                    "<li>Es batu sesuai selera</li>\n" +
                    "</ul>"


    };


    private static String[] deskresep = {

      "Sajian resep ketupat ayam kare untuk hajatan keluaraga atau hajatan hari raya",
      "Resep masakan ayam rica nusantara lezat yang dapat menggunggah selera lidah ",
      "Cumi stick goreng renyah dengan bahan murah dan proses pembuatan yang cukup mudah",
      "Sajian Ceker pedas yang dapat mengunggah selera khusus anda yang doyan makanan pedas",


      "Roti Kismis coco dengan menggunakan bahan biskuit yang bisa anda dapatkan dengan mudah",
      "Resep Roti sosis pedas dengan menggunakan beberapa bahan dan nikmati pedasnya roti sosis",
      "Resep kue benang api dengan menggunakan bahan seadanya, anda bisa membuat sebuah kue benang api",
      "Resep kue daging keju dengan taburan topping diatasnya di jamin akan nikmat di lidah ",


      "Minuman dengan cita rasa teh hijau yang creamy ini juga bisa dibuat dengan bujet murah meriah",
      "Minuman teh susu asal Thailand ini juga populer di Indonesia,mirip dengan cita rasa teh tarik",
      "Belakangan minuman bernama es susu rhum regal banyak diminati para konsumen.",
      "Lelehan gula aren di dinding gelas dipadu dengan putihnya susu cair menghasilkan tampilan apik"

    };


    private static String[] resepmasakan = {

            //FOOD
            "Resep Ketupat Ayam Kare",
            "Resep Ayam Rica",
            "Resep Stick Cumi Goreng",
            "Resep Ceker Pedas",


            //COOKIES
            "Roti Kismis Coco",
            "Roti Sosis Pedas",
            "Kue Benang Api",
            "Resep Kue Daging Keju",


            //DRINK
            "ES Matcha Latte",
            "ES Thai Tea",
            "ES Susu Regal",
            "Brown Sugar Boba Milk"



    };

    private static  String[] penyajianresep = {
            "<h3>Cara pembuatan:</h3>\n" +
                    "<ol>\n" +
                    "<li>Goreng ayam sampai setengah matang. Angkat dan tiriskan. </li>\n" +
                    "<li>Siapkan blender, haluskan bawang merah, bawang putih, cabe merah, kemiri, jahe, kunyit, jintan, dan minyak secukupnya. Blender hingga halus dan tercampur rata. </li>\n" +
                    "<li>Siapkan panci, tumis bumbu halus hingga harum. Masukkan daun jeruk dan daun salam, kapulaga, dan cengkeh tumis hingga harum. Tambahkan garam dan lada putih. </li>\n" +
                    "<li>Masukkan lengkuas, serai, ayam dan tahu goreng, aduk hingga tercampur rata. Tuang air, masak hingga mendidih. </li>\n" +
                    "<li>Masukkan santan, aduk sebentar. Sajikan dengan ketupat. </li>\n" +
                    "</ol>\n",




            "<h3>Cara membuat:</h3>\n" +
                    "<ol>\n" +
                    "<li>Cuci ayam dan potong beberapa bagian sesuai selera. Tumis bumbu halus sampai harum masukkan sisa bahan, tumis sampai bumbu matang dan berubah warna</li>\n" +
                    "\n" +
                    "<li>Masukkan ayam dan air sampai ayam terendam, beri garam, gula, cek rasa. Masak ayam sampai matang, air menyusut dan bumbu menyerap</li>\n" +
                    "\n" +
                    "<li>Sesaat sebelum matikan api, masukkan daun kemangi, aduk sebentar lalu matikan api. Sajikan ayam dengan sisa bumbunya</li>\n" +
                    "</ol>",



            "<h3>Cara pembuatan:</h3>\n" +
                    "<ol>\n" +
                    "<li>Rendam cumi dengan air kapur sirih, diamkan 30-60 menit didalam kulkas. Bilas dan tiriskan. </li>\n" +
                    "<li>Campur cumi dengan bahan kedua, aduk rata dan diamkan 30 menit didalam kulkas. </li>\n" +
                    "<li>Panaskan minyak, tekan tekan cumi kedalam havermout, goreng sampai kecoklatan dengan api kecil sedang. </li>\n" +
                    "</ol>\n",




            "<h3>Cara pembuatan:</h3>\n" +
                    "<ol>\n" +
                    "<li>Cuci bersih ceker, rebus ceker, masukkan jahe, dan garam. Masak sampai ceker empuk. Angkat, tiriskan</li>\n" +
                    "<li>Tumis bumbu halus, masak sampai wangi, masukkan cabai rawit dan cabai keriting rajang</li>\n" +
                    "<li>Lalu masukkan daun jeruk, aduk rata. Tuang air masukkan ceker. Beri garam, gula dan kaldu jamur</li>\n" +
                    "<li>Aduk sampai bumbu tercampur rata dan air menyusut, masukkan air jeruk limau, aduk. </li>\n" +
                    "<li>Angkat dan Siap disajikan</li>\n" +
                    "</ol>\n",





            "<h3>Cara membuat:</h3>\n" +
                    "<ol>\n" +
                    "<li>Lelehkan mentega hingga mencair, campurkan dengan susu kental manis dan gula hingga merata. Aduk-aduk sambil atur api kompor kecil.</li>\n" +
                    "<li>Ambil wadah kosong dan masukkan biskuit marie, kismis, dan santan bubuk.</li>\n" +
                    "<li>Tuang adonan ke dalam loyang dan tambahkan choco chips. Panggang di dalam oven selama 10 menit. Angkat dan potong-potong, lalu sajikan.</li>\n" +
                    "</ol>",






            "<h3>Cara membuat:</h3>\n" +
                    "<ol>\n" +
                    "<li>Campur semua bahan pertama hingga ragi dan gulanya larut dan diamkan hingga berbusa. </li>\n" +
                    "<li>Campur dan ayak semua bahan kedua, kecuali telur dan margarin. </li>\n" +
                    "<li>Tambahkan telur dan campuran bahan pertama pada campuran bahan kedua. Aduk rata dengan spatula, kemudian uleni dengan tangan hingga adonan tercampur rata. </li>\n" +
                    "<li>Tambahkan margarin, kemudian uleni lagi hingga adonan tidak lengket. </li>\n" +
                    "<li>Bentuk adonan menjadi bulatan, letakkan pada wadah kemudian tutup dengan plastic wrap dan istirahatkan selama satu jam hingga adonan mengembang. </li>\n" +
                    "<li>Setelah satu jam, bagi adonan menjadi 12 bagian kecil atau sesuai selera. Diamkan lagi selama 15 menit. </li>\n" +
                    "<li>Letakkan adonan pada kertas roti antilengket, kemudian susun sosis, irisan bawang bombay, keju cheddar parut, saus sambal, dan mayones. Diamkan lagi selama satu jam. </li>\n" +
                    "<li>Panggang adonan dengan suhu 180 derajat Celsius selama 10 menit. Keluarkan dan olesi permukaan adonan dengan kocokan telur, masukkan ke dalam oven kembali selama kurang lebih 30 menit hingga matang. </li>\n" +
                    "</ol>\n",





            "<h3>Cara membuat:</h3>\n" +
                    "<ol>\n" +
                    "<li>Campur semua bahan pertama, kecuali air dingin dalam satu wadah. Aduk-aduk menggunakan sendok.</li>\n" +
                    "<li>Setelah itu, tuang air dingin secukupnya. Uleni hingga adonan menjadi kalis elastis. Simpan di sebuah wadah dan tunggu hingga mengembang.</li>\n" +
                    "<li>Ambil adonan berukuran satu kepalan tangan, olesi dengan mentega dan taburi dengan garam.</li>\n" +
                    "<li>Oven selama 20 menit dengan suhu 200 derajat Celsius. Jika sudah matang, olesi dengan mayones dan taburi dengan abon sapi.</li>\n" +
                    "<ol>",





            "<h3>Cara membuat:</h3>\n" +
                    "<ol>\n" +
                    "<li>Campurkan semua bahan, kecuali mentega dan garam dengan menggunakan mixer hingga kalis. Tambahkan mentega dan garam, aduk kembali hingga kalis elastis.</li>\n" +
                    "<li>Gilas adonan, pipihkan menjadi bentuk persegi panjang. Olesi dengan saus tomat, lalu taburi dengan potongan sosis, irisan smoked beef, dan taburan keju cheddar.</li>\n" +
                    "<li>Gulung adonan hingga ujungnya. Hati-hati supaya isian tidak keluar.</li>\n" +
                    "<li>Potong-potong sesuai selera, lalu diamkan dengan cara ditutup menggunakan kain kurang lebih selama satu jam hingga mengembang dua kali lipat.</li>\n" +
                    "<li>Setelah mengembang, oles dengan kocokan kuning telur, lalu taburi dengan oregano, mayones, dan saus tomat.</li>\n" +
                    "<li>Oven selama 25 sampai 30 menit dengan suhu 170 derajat Celsius.</li>\n" +
                    "</ol>",




            "<h3>Cara Membuat</h3>\n" +
                    "<ol>\n" +
                    "<li>Seduh serbuk green tea instan dengan sedikit air hangat hingga kental. Jika mengikuti saran penyajian dalam kemasan, gunakan sepertiga takaran. Misal cara penyajian menyebutkan 150 ml air, gunakan 50 ml saja agar kekentalannya pas</li>\n" +
                    "<li>Siapkan gelas lalu tata es batu sesuai selera. Lanjutkan dengan menuang susu ke dalamnya</li>\n" +
                    "<li>Setelah es batu terendam susu, tuang perlahan seduhan green tea ke dalam gelas. Gunakan gelas kaca atau bening untuk menghasilkan tampilan yang menggugah selera</li>\n" +
                    "<li>Es matcha latte siap disantap! Jika dirasa kurang manis, tambahkan pemanis sesuai selera.</li>\n" +
                    "</ol>",





            "<h3>Cara Membuat:</h3>\n" +
                    "<ol>\n" +
                    "<li>Didihkan air secukupnya untuk menyeduh teh. Seduh hingga warnanya cukup pekat lalu sisihkan</li>\n" +
                    "<li>Siapkan gelas lalu tuang kental manis diikuti es batu sesuai selera</li>\n" +
                    "<li>Tuang separuh bagian susu cair ke dalam gelas, diikuti seduhan teh</li>\n" +
                    "<li>Tuang lagi separuh bagian susu agar gradasi warnanya nampak cantik</li>\n" +
                    "<li>Es thai tea siap disajikan! Aduk dulu, ya sebelum disantap.</li>\n" +
                    "<ol>",





            "<h3>Cara membuat:</h3>\n" +
                    "<ol>\n" +
                    "<li>Hancurkan satu keping biskuit regal lalu campurkan dengan susu cair, aduk rata</li>\n" +
                    "<li>Siapkan gelas lain, tata es batu sesuai selera</li>\n" +
                    "<li>Tuang campuran susu dan biskuit ke dalamnya, lalu tambahkan esens rhum. Penambahan esens ini gak wajib, kok. Kamu yang kurang suka aroma rhum bisa melewati tahapan ini</li>\n" +
                    "<li>Hancurkan kasar biskuit regal lainnya, lalu masukkan ke dalam gelas. Taraa, es susu regal siap disantap! Gampang, kan?</li>\n" +
                    "</ol>",




            "<h3>Cara Membuat:</h3>\n" +
                    "<ol>\n" +
                    "<li>Serut kasar gula aren dengan bantuan pisau, lalu didihkan dengan satu gelas air hingga mengental</li>\n" +
                    "<li>Di panci terpisah, rebus boba kering hingga mengembang lalu tiriskan</li>\n" +
                    "<li>Panaskan lagi larutan gula aren, lalu masukkan boba dan masak bersama hingga warna boba makin gelap</li>\n" +
                    "<li>Siapkan gelas, ambil satu sendok makan larutan kental gula aren untuk dioleskan di seluruh permukaan gelas bagian dalam</li>\n" +
                    "<li>Masukkan boba sesuai selera ke dalam gelas, lalu tambahkan es batu</li>\n" +
                    "<li>Tuang susu cair hingga gelas penuh dan brown sugar boba milk buatanmu siap disantap! Jika dirasa kurang manis, tambahkan gula cair atau pemanis sesuai selera.</li>\n" +
                    "</ol>"


    };


    private static int[] gambarresep = {

            R.drawable.img_ayamkare,
            R.drawable.img_ayamrica,
            R.drawable.img_cumigoreng,
            R.drawable.img_cekerpedas,


            R.drawable.img_rotikismis,
            R.drawable.img_rotisosis,
            R.drawable.img_kuebenangapi,
            R.drawable.img_resepkuekeju,


            R.drawable.img_eslatte,
            R.drawable.img_estaitea,
            R.drawable.img_essusuregal,
            R.drawable.img_sugarboba
    };

    static ArrayList<Resep> getdata(){
        ArrayList<Resep> listmasakan = new ArrayList<>();
        for (int posisi = 0; posisi < resepmasakan.length; posisi++){
            Resep resep = new Resep();
            resep.setJudul(resepmasakan[posisi]);
            resep.setBahan(bahanresep[posisi]);
            resep.setIsi(deskresep[posisi]);
            resep.setPenyajian(penyajianresep[posisi]);
            resep.setGambarResep(gambarresep[posisi]);
            listmasakan.add(resep);
        }
        return listmasakan;

    }



    static ArrayList<Resep> getfood(){

        ArrayList<Resep> listfood = new ArrayList<>();

         for(int pos = 0; pos <= 3; pos++ ) {
            Resep resepfood = new Resep();
            resepfood.setJudul(resepmasakan[pos]);
            resepfood.setBahan(bahanresep[pos]);
            resepfood.setIsi(deskresep[pos]);
            resepfood.setPenyajian(penyajianresep[pos]);
            resepfood.setGambarResep(gambarresep[pos]);

            listfood.add(resepfood);
        }
        return listfood;
    }


    static ArrayList<Resep> getcookies(){

        ArrayList<Resep> listcookies = new ArrayList<>();

        for(int positioncook = 4; positioncook <= 7; positioncook++ ) {
            Resep resepcookd = new Resep();
            resepcookd.setJudul(resepmasakan[positioncook]);
            resepcookd.setBahan(bahanresep[positioncook]);
            resepcookd.setIsi(deskresep[positioncook]);
            resepcookd.setPenyajian(penyajianresep[positioncook]);
            resepcookd.setGambarResep(gambarresep[positioncook]);

            listcookies.add(resepcookd);
        }
        return listcookies;
    }



    static ArrayList<Resep> getdrink(){

        ArrayList<Resep> listdrink = new ArrayList<>();

        for(int positiondrink = 8; positiondrink <= 11; positiondrink++ ) {
            Resep resepdrink = new Resep();
            resepdrink.setJudul(resepmasakan[positiondrink]);
            resepdrink.setBahan(bahanresep[positiondrink]);
            resepdrink.setIsi(deskresep[positiondrink]);
            resepdrink.setPenyajian(penyajianresep[positiondrink]);
            resepdrink.setGambarResep(gambarresep[positiondrink]);

            listdrink.add(resepdrink);
        }
        return listdrink;
    }








}
