package controllers

import java.net.URI

import com.marklogic.xcc.{Session, ContentSourceFactory}


/**
 * Created by njm1688 on 4/25/16.
 */
object SearchService {

//    def search ={
//
//      val uri :URI = new URI("xcc://admin:admin@localhost:8050/bookStore");
//      val contentSource = ContentSourceFactory.newContentSource(uri);
//
//      val session = contentSource.newSession();
//      val request = session.newAdhocQuery("Slide.xml");
//      val  rs = session.submitRequest(request);
//      println(rs.asString());
//      session.close();
//    }

//    def insert = {
//
//      val uri = new URI("xcc://admin:admin@localhost:8050/Documents");
//      val contentSource = ContentSourceFactory
//        .newContentSource(uri);
//      val session = contentSource.newSession();
//      session.setTransactionMode(Session.TransactionMode.UPDATE);
//
//      // Re-try logic for a multi-statement transaction
//
//      session.submitRequest(session
//        .newAdhocQuery("xdmp:document-insert('/docs/catalog.xml', "
//          + XmlContent.CATALOG + ")"));
//      session.submitRequest(session
//        .newAdhocQuery("xdmp:document-insert('/docs/bookstore.xml', "
//          + XmlContent.BOOKSTORE + ")"));
//      session.commit();
//
//
//      session.close();
//
//    }

}
