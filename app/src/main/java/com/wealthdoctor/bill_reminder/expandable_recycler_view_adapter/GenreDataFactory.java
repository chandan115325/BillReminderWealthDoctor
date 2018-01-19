package com.wealthdoctor.bill_reminder.expandable_recycler_view_adapter;


import com.wealthdoctor.R;

import java.util.Arrays;
import java.util.List;

public class GenreDataFactory {

    public static List<Genre> makeGenres() {
        return Arrays.asList(makeRockGenre(),
                makeJazzGenre(),
                makeClassicGenre(),
                makeSalsaGenre(),
                makeBluegrassGenre());
    }



    public static Genre makeRockGenre() {
        return new Genre("Airtel", makeRockArtists(), R.mipmap.ic_launcher_round);
    }



    public static List<Artist> makeRockArtists() {
        Artist queen = new Artist("Delete",R.id.child_delete,R.id.child_edit, true);
        //Artist styx = new Artist("Edit",1,1, false);
        //Artist reoSpeedwagon = new Artist("Already Paid", 1,1,false);
        //Artist boston = new Artist("Boston", true);

        return Arrays.asList(queen);
    }

    public static Genre makeJazzGenre() {
        return new Genre("SBI", makeJazzArtists(), R.mipmap.ic_launcher_round);
    }



    public static List<Artist> makeJazzArtists() {
        Artist milesDavis = new Artist("Miles Davis",1,1, true);
        Artist ellaFitzgerald = new Artist("Ella Fitzgerald", 1,1,true);
        Artist billieHoliday = new Artist("Billie Holiday", 1,1,false);

        return Arrays.asList(milesDavis, ellaFitzgerald, billieHoliday);
    }

    public static Genre makeClassicGenre() {
        return new Genre("Axis Bank", makeClassicArtists(), R.mipmap.ic_launcher_round);
    }



    public static List<Artist> makeClassicArtists() {
        Artist beethoven = new Artist("Ludwig van Beethoven", 1,1,false);
        Artist bach = new Artist("Johann Sebastian Bach", 1,1,true);
        Artist brahms = new Artist("Johannes Brahms", 1,1,false);
        Artist puccini = new Artist("Giacomo Puccini", 1,1,false);

        return Arrays.asList(beethoven, bach, brahms, puccini);
    }

    public static Genre makeSalsaGenre() {
        return new Genre("BMTC", makeSalsaArtists(), R.mipmap.ic_launcher_round);
    }



    public static List<Artist> makeSalsaArtists() {
        Artist hectorLavoe = new Artist("Hector Lavoe", 1,1,true);
        Artist celiaCruz = new Artist("Celia Cruz", 1,1,false);
        Artist willieColon = new Artist("Willie Colon", 1,1,false);
        Artist marcAnthony = new Artist("Marc Anthony", 1,1,false);

        return Arrays.asList(hectorLavoe, celiaCruz, willieColon, marcAnthony);
    }

    public static Genre makeBluegrassGenre() {
        return new Genre("BSNL", makeBluegrassArtists(), R.mipmap.ic_launcher_round);
    }



    public static List<Artist> makeBluegrassArtists() {
        Artist billMonroe = new Artist("Bill Monroe", 1,1,false);
        Artist earlScruggs = new Artist("Earl Scruggs", 1,1,false);
        Artist osborneBrothers = new Artist("Osborne Brothers", 1,1,true);
        Artist johnHartford = new Artist("John Hartford", 1,1,false);

        return Arrays.asList(billMonroe, earlScruggs, osborneBrothers, johnHartford);
    }

}

