package com.kerryliang.mytest.xpath;

import org.apache.ibatis.io.Resources;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;

public class XPathExpresionTest {

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();


        documentBuilderFactory.setValidating(true);
        documentBuilderFactory.setNamespaceAware(false);
        documentBuilderFactory.setIgnoringComments(true);
        documentBuilderFactory.setIgnoringElementContentWhitespace(false);
        documentBuilderFactory.setCoalescing(false);
        documentBuilderFactory.setExpandEntityReferences(true);

        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        builder.setErrorHandler(new ErrorHandler() {
            @Override
            public void warning(SAXParseException exception) throws SAXException {
                System.out.println("warn:" + exception.getMessage() );
            }

            @Override
            public void error(SAXParseException exception) throws SAXException {
                System.out.println("error:" + exception.getMessage() );
            }

            @Override
            public void fatalError(SAXParseException exception) throws SAXException {
                System.out.println("fatalError:" + exception.getMessage() );
            }
        });

        InputStream inputStream = Resources.getResourceAsStream("com/kerryliang/mytest/xpath/html.xml");
        Document doc = builder.parse(inputStream);
        XPathFactory factory = XPathFactory.newInstance();
        XPath xPath = factory.newXPath();

        //选择所有节点
        XPathExpression expr = xPath.compile("/*");
        Object result = expr.evaluate(doc,XPathConstants.NODESET);
        NodeList nodes = (NodeList) result;
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            System.out.println("nodeName=" + node.getNodeName());
            System.out.println("nodeValue=" + node.getNodeValue());
            System.out.println("TextContent=" + node.getTextContent());
            System.out.println("NodeType=" + node.getNodeType());
            System.out.println("++++++++++++++");
        }

    }
}
