package ru.netology.domain.manager.PosterManager;

public class ManagerPoster {
    int count = 10;



    private PosterItem[] items = new PosterItem[0];

    public void add(PosterItem item) {
        //создание нового массива на единицу больше
        int lenght = items.length + 1;
        PosterItem[] tmp = new PosterItem[lenght];
        //копирование поэлементно

        System.arraycopy(items, 0, tmp, 0, items.length);
        //кладется последний элемент
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = item;
        items = tmp;
    }

    public PosterItem[] getAll() {
        int resultLength;
        if (items.length > count) {
            resultLength = count;
        } else {
            resultLength = items.length;
        }
        PosterItem[] result = new PosterItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}

