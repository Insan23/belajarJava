/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.cobatrycatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 * @author Aleq
 */
public class CobaTryCatch {

    final int MAX = 100; // maksimum nilai koneksi atau jumlah penerbangan dalam database

    // variabel array utk informasi penerbangan.
    flightInfo flights[] = new flightInfo[MAX];

    int numFlights = 0; // jumlah info penerbangan

    Stack btStack = new Stack(); // backtrack stack

    public static void main(String args[]) {
        String to, from;
        CobaTryCatch ob = new CobaTryCatch();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ob.setup();

        try {
            System.out.print("From? ");
            from = br.readLine();
            System.out.print("To? ");
            to = br.readLine();

            ob.isflight(from, to);

            if (ob.btStack.size() != 0) {
                ob.route(to);
            }
        } catch (IOException exc) {
            System.out.println("Error on input.");
        }
    }

    //inisialisasi database penerbangan.
    void setup() {
        addFlight("New York", "Chicago", 900);
        addFlight("Chicago", "Denver", 1000);
        addFlight("New York", "Toronto", 500);
        addFlight("New York", "Denver", 1800);
        addFlight("Toronto", "Calgary", 1700);
        addFlight("Toronto", "Los Angeles", 2500);
        addFlight("Toronto", "Chicago", 500);
        addFlight("Denver", "Urbana", 1000);
        addFlight("Denver", "Houston", 1000);
        addFlight("Houston", "Los Angeles", 1500);
        addFlight("Denver", "Los Angeles", 1000);
    }

    //letakkan penerbangan ke dalam database.
    void addFlight(String from, String to, int dist) {
        if (numFlights < MAX) {
            flights[numFlights] = new flightInfo(from, to, dist);
            numFlights++;
        } else {
            System.out.println("Flight database full.\n");
        }
    }

    // perlihatkan route dan total jarak.
    void route(String to) {
        Stack rev = new Stack();
        int dist = 0;
        flightInfo f;
        int num = btStack.size();

        // balik stack untuk menunjukkan route.
        for (int i = 0; i < num; i++) {
            rev.push(btStack.pop());
        }

        for (int i = 0; i < num; i++) {
            f = (flightInfo) rev.pop();
            System.out.print(f.from + " to ");
            dist += f.distance;
        }

        System.out.println(to);
        System.out.println("Distance is " + dist);
    }

    /*
   * jika penerbangan adalah dari from menuju ke to, kembalikan jarak penerbangan;
   * jika tidak maka return 0.
     */
    int match(String from, String to) {
        for (int i = numFlights - 1; i > -1; i--) {
            if (flights[i].from.equals(from) && flights[i].to.equals(to)
                    && !flights[i].skip) {
                flights[i].skip = true; // prevent reuse
                return flights[i].distance;
            }
        }
        return 0; // ndak ketemu
    }

    // Given from, find any connection.
    flightInfo find(String from) {
        for (int i = 0; i < numFlights; i++) {
            if (flights[i].from.equals(from) && !flights[i].skip) {
                flightInfo f = new flightInfo(flights[i].from, flights[i].to,
                        flights[i].distance);
                flights[i].skip = true; // prevent reuse
                return f;
            }
        }
        return null;
    }

    // Determine if there is a route between from and to.
    void isflight(String from, String to) {
        int dist;
        flightInfo f;

        // lihat apakah termasuk node tujuan.
        dist = match(from, to);
        if (dist != 0) {
            btStack.push(new flightInfo(from, to, dist));
            return;
        }

        // coba koneksi yang lain.
        f = find(from);
        if (f != null) {
            btStack.push(new flightInfo(from, to, f.distance));
            isflight(f.to, to);
        } else if (btStack.size() > 0) {
            // Backtrack dan coba koneksi yang lain.
            f = (flightInfo) btStack.pop();
            isflight(f.from, f.to);
        }
    }
}
