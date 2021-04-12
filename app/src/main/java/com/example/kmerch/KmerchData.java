package com.example.kmerch;

import com.example.kmerch.album.AlbumModel;
import com.example.kmerch.ls.LSModel;
import com.example.kmerch.merch.MerchModel;

import java.util.ArrayList;

public class KmerchData {
    private static  String[] namaAlbum = new String[]{"You Made My Dawn\n SEVENTEEN", "You Make My Day\n SEVENTEEN", "Teen Age\n SEVENTEEN", "Regular-Irregular\n NCT 127", "We Boom\n NCT DREAM", "Take Off\n WAY V", "Super Human\n NCT 127"};

    private static int[] gambarAlbum = new int[]{R.drawable.album_1, R.drawable.album_2, R.drawable.album_3, R.drawable.album_4, R.drawable.album_5, R.drawable.album_6, R.drawable.album_7};

    private static  String[] namaLS = new String[]{"Caratbong Ver. 2", "Meumwonbong Ver. 1", "Leekbong Ver. 1", "KONBAT Ver. 2", "My Day Lightband Ver. 1", "Shating Star Ver. 2", "Nachimbong Ver. 1", "Heart Bbyongbong Ver. 2"};

    private static int[] gambarLS = new int[]{R.drawable.ls_1, R.drawable.ls_2, R.drawable.ls_3, R.drawable.ls_4, R.drawable.ls_5, R.drawable.ls_6, R.drawable.ls_7, R.drawable.ls_8};

    private static  String[] namaMerch = new String[]{"T-Shirt Vernon SVT", "Sweater Neozone NCT", "Sweater Resonance NCT", "T-Shirt Resonance NCT (Black)", "T-Shirt Resonance NCT (White)", "T-Shirt StrayKids (Black)", "Sweater StrayKids", "T-Shirt StrayKids (White)", "T-Shirt TheBoyz"};

    private static int[] gambarMerch = new int[]{R.drawable.merch_1, R.drawable.merch_2, R.drawable.merch_3, R.drawable.merch_4, R.drawable.merch_5, R.drawable.merch_6, R.drawable.merch_7, R.drawable.merch_8, R.drawable.merch_9};

    public static ArrayList<AlbumModel> getListDataM(){
        AlbumModel albumModel = null;
        ArrayList<AlbumModel> listAlbum = new ArrayList<AlbumModel>();
        for ( int i = 0; i < namaAlbum.length; i++){
            albumModel = new AlbumModel();
            albumModel.setGambarItem(gambarAlbum[i]);
            albumModel.setNamaItem(namaAlbum[i]);
            listAlbum.add(albumModel);
        }
        return listAlbum;
    }

    public static ArrayList<LSModel> getListDataK(){
        LSModel lsModel = null;
        ArrayList<LSModel> listLS = new ArrayList<LSModel>();
        for ( int i = 0; i < namaLS.length; i++){
            lsModel = new LSModel();
            lsModel.setGambarItem(gambarLS[i]);
            lsModel.setNamaItem(namaLS[i]);
            listLS.add(lsModel);
        }
        return listLS;
    }

    public static ArrayList<MerchModel> getListDataH(){
        MerchModel merchModel = null;
        ArrayList<MerchModel> listMerch = new ArrayList<MerchModel>();
        for ( int i = 0; i < namaMerch.length; i++){
            merchModel = new MerchModel();
            merchModel.setGambarItem(gambarMerch[i]);
            merchModel.setNamaItem(namaMerch[i]);
            listMerch.add(merchModel);
        }
        return listMerch;
    }
}