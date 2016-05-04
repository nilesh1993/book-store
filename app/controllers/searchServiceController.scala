package controllers

import java.net.URI

import com.marklogic.xcc.{ResultSequence, Session, ContentSourceFactory}

/**
 * Created by njm1688 on 4/29/16.
 */
class searchServiceController {

  def search(bookId:String,dropdownValue:String): ResultSequence ={

    val uri :URI = new URI("xcc://admin:admin@localhost:8050/bookStore");
    val contentSource = ContentSourceFactory.newContentSource(uri);
    val session = contentSource.newSession();
    var query: String = ""
    //val dropdownValue = "BookId"
    val drop="$book//"+dropdownValue+""
    println("drop--------"+drop)

    //println("bookId------------>"+bookId.toList.head)
    //println("dropdownValue------------>"+dropdownValue.toList.head)
    session.setTransactionMode(Session.TransactionMode.UPDATE);

//    dropdownValue match {
//      case _ => query = "cts:search(//Book, cts:element-value-query(xs:QName(\"" + dropdownValue+ "\"), \"" + bookId + "\"))"
//      case "element"=> query="cts:search(/,cts:word-query(\"" + bookId.toList.head + "\"))"
//    }
    //query = "cts:search(//Book, cts:element-value-query(xs:QName(\"" + dropdownValue+ "\"), \"" + bookId + "\"))"
    //println("Query : ", query)

    val rs: ResultSequence =session.submitRequest(session.newAdhocQuery("for $book in doc('catalogg.xml')//Book where "+drop+" = (\""+bookId+"\") return ($book//bookId, $book//bookName, $book//bookAuthor)"));
    //println("rs in service------------------>"+rs)
    println("hello")
    //val rs=session.submitRequest(session.newAdhocQuery(query))
    session.commit();
    session.close();

    rs
    //rs.asString()

  }

}
