package com.generation.dia20220527;

import java.util.HashMap;
import java.util.Scanner;

public class CasinoMap
{
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    HashMap objHashMap = new HashMap();

    // Agregando keys y values al objHasMap .put
		objHashMap.put("comida1", "pastel de choclo");
		objHashMap.put("comida2", "humitas");
		objHashMap.put("comida3", "porotos con riendas");
		objHashMap.put("comida4", "sopaipilla pasadas <3");
		objHashMap.put("comida5", "milanesa con pure");

		System.out.println("Platos disponible Casino Grupo2");
		System.out.println("Los platos disponible son: " + objHashMap);
    	// {menu1="",menu2=""}
		System.out.println("¿Que comida quieres?");
    	//String platoUsuario = sc.Scanner();
    	String platoUsuario = sc.next();

		System.out.println("El Menu elegido fue: " + objHashMap.get(platoUsuario));
}}
