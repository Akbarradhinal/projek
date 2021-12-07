package com.dicoding.proyekakhir;

import java.util.ArrayList;

public class WisataData {
    private static String[] wisataNames = {
            "Tanjung Matop",
            "Pantai Lalos",
            "Pulau Kapas",
            "Kampung Wisata Desa Malangga",
            "Ratu Ampat",
            "Air Terjun Sigelang",
            "Bukit Keles",
            "Sabang Tende",
            "Air Terjun Malangga",
            "Pulau Linganyan"
    };

    private static String[] wisataDetails = {
            "Lokasi: Pinjan, Kec Tanjung Matop, Kab. Tolitoli. Tempat satu ini akan membawa anda bertemu dengan fauna fauna langka kebanggan Indonesia yang jarang ditemui. Seperti burung Maleo, Kepiting kenari, penyu sisik hijau hijau, burung enggang hingga kera hantu. Kawasan ini memang menjadi hutan lindung namun bukan berarti anda tak bisa mengunjunginya. Tak hanya sebagai kawasan hutang lindung, tanjung Matop juga digunakan sebagai tempat konservasi burung Maleo. Endemik satu ini memang menjadi kebanggaan Sulawesi yang kini makin sudah jarang ditemui. Jika anda beruntung anda bisa ikut bergabung untuk, berburu telur burung Maleo kemudian ikut mengembangkannya. Selain melihat lebih dekat, habitat asli burung Maleo anda juga memiliki kesempatan untuk menambah wawasan anda.",
            "Lokasi: Lalos, Kec. Galang, Kab. Toli-Toli. Tempat wisata di Tolitoli satu ini sangat populer apalagi lokasinya juga dekat dengan pusat kota. Sehingga sangat mudah untuk dikunjungi para wisatawan. Anda akan menikmati hamparan laut yang biru dengan pasirnya yang bewarna keemasan. Tak hanya cocok sebagai tempat untuk bersantai, anda juga bisa melakukan aktivitas seperti snorkeling atau berenang. Ombak pantai Lalos cukup tenang sehingga banyak anak anak yang sering bermain air di pinggir pantai. Jika anda berniat untuk mengunjungi pantai Lalos, anda hanya membutuhkan waktu 20 menit dari pusat kota. Akan semakin mudah ketika anda baru saja tiba di Bandara, karena pantai ini dekat dengan Bandara Sultan Bantilan.",
            "Lokasi: Kapas, Kec. Dako Pamean, Kab. Toli-Toli. Beriwisata bahari ke Tolitoli anda tak bisa bbegitu saja melewatkan keindahan Pulau Kapas. Pulau ini tak hanya indah, namun juga akan membuat anda mengenal budaya adat suku Bajao yang sangat unik. Karena tempat wisata di Tolitoli ini memiliki dua pulau terluar yakni Dolangan dan Salando beserta sebuah desa bernama Santigi. Pemandangan alamnya yang menakjubkan tak akan pernah menyesal pernah datang ke Tolitoli. Kegiatan seperti diving dan snorkeling sangat cocok untuk dilakukan di pulau ini. Anda juga bisa menikmati kelembutan pasir putihnya dengan batu karang kokoh yang mempercantik pulau ini.",
            "Lokasi: Tinigi, Kec. Galang, Kab. Toli-Toli. Jika anda ingin melihat keindahan Tolitoli melalui sudut pandang yang lain, anda bisa mencoba mengunjungu kampung wisata di Desa Malangga. Desa ini akan membawa anda untuk mempelajari budaya masyarakat sekitar. Alamnya yang masih asri juga membuka kesempatan lebar untuk anda menjelajah. Karena ada beberapa titik air terjun yang patut untuk anda kunjungi sehingga liburan anda semakin berkesan. Tempat wisata di Tolitoli ini sangat rekomended untuk anda yang ingin dekat dengan alam.",
            "Lokasi: Malala, Kec. Dondo, Kab. Toli-Toli. Satu lagi tempat di Tolitoli yang menawarkan keindahan bahari yang memukau. Keindahannya bahkan mampu untuk menarik wisatawan untuk menjelajah dan meniliknya. Wajar saja tak hanya menjanjikan sunset dan sunrise yang indah, anda juga bisa bertemu dengan mamalia laut jika beruntung. Tentunya melihat langsung mamalia seperti paus, ikan duyung hingga hiu secara langsung tentu akan menjadi dambaan setiap orang. Ratu empat terletak di Desa Malala, Kec. Dondo, Ratu Empat. Memang perairan satu ini sering sekali ditemukan mamalia yang bermain di perairan ini. Sampai di pulau ini anda harus mengunakan perahu nelayan yang memang sering digunakan untuk mengantar ke Ratu Empat.",
            "Lokasi: Oyom, Kec. Lampasio, Kab. Tolitoli. Tolitoli juga memiliki air terjun yang harus anda singgahi ketika menginjakkan kaki ke Tolitoli. Objek wisata satu ini menjadi objek wisata yang populer dan banyak disinggahi karena memang dekat dengan kota Tolitoli. Air terjun Sigelang hanya membutuhkan sekitar 15km jarak tempuh kemudian anda akan dimanjakan dengan pesonanya. Di Tempat wisata di Tolitoli ini anda bisa menikmati air terjun yang jernih dengan udaranya yang segar dan asri.",
            "Lokasi: Panasakan, Kec. Baolan, Kab. Toli-Toli. Bukit satu ini menyajikan paronama perbukitan yang sangat cocok untuk anda yang hobi fotografi. Hamparan bukit hijau dengan gundukan gunukan kecil dan jalan berliku yang sangat menyejukkan mata anda. Bukit ini juga dikenal dengan bukit teletubies yang kini menjadi destinasi wajib ketika berkunjung ke Tolitoli. Tak hanya cantik di kala matahari masih benderang, banyak juga muda mudi datang ketika malam datang. Untuk mendapatkan sensasi yang menyenangkan anda bisa menghabiskan malam hari dengan berkemah di bukit ini.",
            "Lokasi: Sabang, Kec, Galang, Kab. Tolitoli. Agar anda semakin puas menjelajah wisata bahari Tolitoli, anda tak bisa melewatkan destinasi satu ini. Tempat wisata di Tolitoli satu ini menjadi tempat yang populer serta andalan masyarakat. Para turis sengaja datang untuk menikmati hamparan pasir putih yang lembut yang berpadu dengan birunya lautan yang luas. Anda bisa melakukan aktivitas snorkeling untuk melihat kekayaan biota lautnya yang masih alami. Selain menyelam anda juga bisa bersantai di gazebo yang disediakan. Jika anda berkenan anda bisa mencoba outbond bersama teman atau keluarga anda.",
            "Masih ada satu lagi destinasi wisata air terjun di Tolitoli yang bisa anda kunjungi. Dibalik rerimbunan pepohonan dan juga segarnya air sungai, anda bisa bermain air atau sekedar menikmati suara gemercik air dari tepian sungai.",
            "Memasuki objek wisata Tolitoli satu ini anda akan disambut dengan rerimbunan hutan bakau yang asri. Pulau yang hanya dihuni puluhan kepala keluarga ini juga memiliki pantai-pantai indah dan juga batu-batu karang yang ekstotis. Mengunjungi destinasi wisata Tolitoli satu ini, ada banyak aktivitas yang anda bisa lakukan mulai dari diving hingga memancing."
    };

    private static int[] wisataImages = {
            R.drawable.tanjung_matop,
            R.drawable.pantai_lalos,
            R.drawable.pulau_kapas,
            R.drawable.kampung_wisata_desa_malangga,
            R.drawable.ratu_ampat,
            R.drawable.air_terjun_sigelang,
            R.drawable.bukit_keles,
            R.drawable.sabang_tende,
            R.drawable.air_terjun_malangga,
            R.drawable.pulau_lingayan,
    };

    static ArrayList<WisataModel> getListData(){
        ArrayList<WisataModel> list = new ArrayList<>();
        for (int position = 0; position < wisataNames.length; position++){
            WisataModel wisatamodel = new WisataModel();
            wisatamodel.setName(wisataNames[position]);
            wisatamodel.setDetail(wisataDetails[position]);
            wisatamodel.setPhoto(wisataImages[position]);
            list.add(wisatamodel);
        }
        return list;
    }
}
