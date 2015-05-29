package com.tot;

import org.apache.commons.collections4.iterators.LazyIteratorChain;
import org.apache.commons.collections4.list.LazyList;
import org.eclipse.jetty.server.Server;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Created by Administrator on 2015/5/28.
 */
public class JettyServer {
    public static void main(String[] args) throws Exception{
        System.out.print("HELLOxxxxx");
         Class c =   Class.forName("org.eclipse.jetty.server.Response");
        if(c != null){
           System.out.println("cccc"+c);
        }
//        Iterator it = new LazyIteratorChain() {
//            @Override
//            protected Iterator nextIterator(int i) {
//                return null;
//            }
//        };
//        Server server = new Server(8080);
//        server.start();
//        server.join();
    }
}
