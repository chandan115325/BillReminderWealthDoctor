package com.wealthdoctor.bill_reminder.expandable_recycler_view_main_activity;


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
        Artist queen = new Artist("Delete", true);
        Artist styx = new Artist("Edit", false);
        Artist reoSpeedwagon = new Artist("Already Paid", false);
        //Artist boston = new Artist("Boston", true);

        return Arrays.asList(queen, styx, reoSpeedwagon);
    }

    public static Genre makeJazzGenre() {
        return new Genre("SBI", makeJazzArtists(), R.mipmap.ic_launcher_round);
    }



    public static List<Artist> makeJazzArtists() {
        Artist milesDavis = new Artist("Miles Davis", true);
        Artist ellaFitzgerald = new Artist("Ella Fitzgerald", true);
        Artist billieHoliday = new Artist("Billie Holiday", false);

        return Arrays.asList(milesDavis, ellaFitzgerald, billieHoliday);
    }

    public static Genre makeClassicGenre() {
        return new Genre("Axis Bank", makeClassicArtists(), R.mipmap.ic_launcher_round);
    }



    public static List<Artist> makeClassicArtists() {
        Artist beethoven = new Artist("Ludwig van Beethoven", false);
        Artist bach = new Artist("Johann Sebastian Bach", true);
        Artist brahms = new Artist("Johannes Brahms", false);
        Artist puccini = new Artist("Giacomo Puccini", false);

        return Arrays.asList(beethoven, bach, brahms, puccini);
    }

    public static Genre makeSalsaGenre() {
        return new Genre("BMTC", makeSalsaArtists(), R.mipmap.ic_launcher_round);
    }



    public static List<Artist> makeSalsaArtists() {
        Artist hectorLavoe = new Artist("Hector Lavoe", true);
        Artist celiaCruz = new Artist("Celia Cruz", false);
        Artist willieColon = new Artist("Willie Colon", false);
        Artist marcAnthony = new Artist("Marc Anthony", false);

        return Arrays.asList(hectorLavoe, celiaCruz, willieColon, marcAnthony);
    }

    public static Genre makeBluegrassGenre() {
        return new Genre("BSNL", makeBluegrassArtists(), R.mipmap.ic_launcher_round);
    }



    public static List<Artist> makeBluegrassArtists() {
        Artist billMonroe = new Artist("Bill Monroe", false);
        Artist earlScruggs = new Artist("Earl Scruggs", false);
        Artist osborneBrothers = new Artist("Osborne Brothers", true);
        Artist johnHartford = new Artist("John Hartford", false);

        return Arrays.asList(billMonroe, earlScruggs, osborneBrothers, johnHartford);
    }

}

