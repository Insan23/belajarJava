/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.cobatrycatch;

/**
 *
 * @author Aleq
 */
//menemukan koneksi dengan metode depth-first search.
import java.util.*;
import java.io.*;

//kelas utk informasi penerbangan.
public class flightInfo {

    String from;
    String to;
    int distance;
    boolean skip; // digunakan untuk backtracking

    flightInfo(String f, String t, int d) {
        from = f;
        to = t;
        distance = d;
        skip = false;
    }
}
