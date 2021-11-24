package ru.netology.domain.manager.PosterManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerPosterTest {

    ManagerPoster manager = new ManagerPoster();

    PosterItem first = new PosterItem (1, 1, "вечные", "драма", false);
    PosterItem second = new PosterItem(2, 2, "не время умирать", "боевик", false);
    PosterItem third = new PosterItem(3, 3, "ряд 19", "драма", false);
    PosterItem fourth = new PosterItem(4, 4, "кощей.начало", "мультфильм", false);
    PosterItem fifth = new PosterItem(5,5,"веном 2", "ужасы", false);
    PosterItem sixth = new PosterItem(6,6, "друг на продажу", "мелодрама", false);
    PosterItem seventh = new PosterItem(7,7,"дюна","боевик", false);
    PosterItem eighth = new PosterItem(8,8,"вкус жизни", "драма",false);
    PosterItem ninth = new PosterItem(9,9,"страшные истории для рассказа незнакомцам","ужасы",false);
    PosterItem ten = new PosterItem(10,10,"хэлоуин убивает", "ужасы",false);
    PosterItem eleventh = new PosterItem(11,11,"ледяной демон", "ужасы",false);
    PosterItem twelve = new PosterItem(12,12,"кошмар на улице вязов", "ужасы",false);

@Test
public void shouldAddMaximumMovies(){
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);
    manager.add(eighth);
    manager.add(ninth);
    manager.add(ten);
    PosterItem[] actual = manager.getAll();
    PosterItem[] expected = new PosterItem[]{ten,ninth,eighth,seventh,sixth,fifth,fourth,third,second,first};
    assertArrayEquals(expected, actual);
}

@Test
    public void shouldAddOneMovies(){
    manager.add(first);
    PosterItem[] actual = manager.getAll();
    PosterItem[] expected = new PosterItem[]{first};
    assertArrayEquals(expected,actual);
}

@Test
    public void shouldAddNothing(){
    PosterItem[] actual = manager.getAll();
    PosterItem[] expected = new PosterItem[]{};
    assertArrayEquals(expected,actual);
}

@Test
    public void shouldAddAllHowMuch(){
    manager.add(first);
    manager.add(second);
    manager.add(third);
    PosterItem[] actual = manager.getAll();
    PosterItem[] expected = new PosterItem[]{third,second,first};
    assertArrayEquals(expected,actual);
}

@Test
    public void shouldAddAll(){
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);
    manager.add(eighth);
    manager.add(ninth);
    manager.add(ten);
    manager.add(eleventh);
    manager.add(twelve);
    PosterItem[] actual = manager.getAll();
    PosterItem[] expected = new PosterItem[]{twelve,eleventh,ten,ninth,eighth,seventh,sixth,fifth,fourth,third};
    assertArrayEquals(expected, actual);
}




}