package ru.netology.domain.manager.PosterManager;

public class PosterItem {
    private int id;
    private int idFilm;
    private String filmName;
    private int count = 10;
    private int genre;

    public PosterItem(int count) {
        this.count = count;
    }

    public PosterItem() {
    }

    private PosterItem[] items = new PosterItem[0];

    public void add(PosterItem item){
        //создание нового массива на единицу больше
        int lenght = items.length +1;
        PosterItem[] tmp = new PosterItem[lenght];
        //копирование поэлементно

        System.arraycopy(items, 0, tmp, 0, items.length);
        //кладется последний элемент
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = item;
        items = tmp;
    }
    public PosterItem[] getAll(){
        if(items.length > count){
            count = count;
        }else {
            count = items.length;
        }
            PosterItem[] result = new PosterItem[items.length];
        for(int i = 0; i < result.length; i++){
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }






}
