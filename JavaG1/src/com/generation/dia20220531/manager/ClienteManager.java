package com.generation.dia20220531.manager;

import com.generation.dia20220531.Cliente;

import java.util.List;


//logica de negocio
public class ClienteManager {

    //recorre el arreglo e imprime
    // esta clase hace toda la logica respecto a los clientes

    public void recorreArregloCliente(List<Cliente> listaClientes){
        //los estatic solo se usan cuando se quiere usar dentro de la clase
        for (Cliente cliente: listaClientes)
        {
            System.out.println(cliente.toString());
        }
    }
}
