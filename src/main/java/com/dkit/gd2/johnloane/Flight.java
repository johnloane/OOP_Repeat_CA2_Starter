package com.dkit.gd2.johnloane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author John Loane
 */
public class Flight
{
    private String id;
    private String origin;
    private String destination;


    public Flight(String id, String origin, String destination)
    {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
    }
}
