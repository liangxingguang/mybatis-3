package com.kerryliang.mytest.parse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.parsing.XNode;
import org.apache.ibatis.parsing.XPathParser;

import java.io.IOException;
import java.io.InputStream;

public class XPathParserTest {

    public static void main(String[] args) {
        String resource = "resources/nodelet_test1.xml";
        try (InputStream inputStream = Resources.getResourceAsStream(resource)) {
            XPathParser parser = new XPathParser(inputStream, false, null, null);
            System.out.println(parser.evalBoolean("/employees/employee/active"));
            //当前结点所有名称为employee的直接子节点，由于当前结点是根节点，下面没有employee的直接节点
            // /employee=[]
            System.out.println("/employee=" + parser.evalNodes("/employee"));
            //当前结点所有名称为employee的直接子节点，由于当前结点是根节点，存在employees直接节点
            // /employees的结果为整个xml文档
            System.out.println("/employees=" + parser.evalNodes("/employees"));
            //当前结点所有名称为employee的子孙节点
            System.out.println("//employee=" + parser.evalNodes("//employee"));
            System.out.println("/employees//employee=" + parser.evalNodes("/employees//employee"));
            System.out.println("/employees/employee=" + parser.evalNodes("/employees/employee"));
            System.out.println("/employees/last_name=" + parser.evalNodes("/employees/last_name"));
            System.out.println("/employees//last_name=" + parser.evalNodes("/employees//last_name"));
//            System.out.println(parser.evalLong("/employee/birth_date/year"));
//            System.out.println(parser.evalShort("/employee/birth_date/month"));
//            System.out.println(parser.evalInteger("/employee/birth_date/day"));
//            System.out.println(parser.evalFloat("/employee/height"));
//            System.out.println(parser.evalDouble("/employee/height"));
//            System.out.println(parser.evalString("/employee/@id"));
//            System.out.println(parser.evalNode("/employee/@id").toString());
//            System.out.println(parser.evalNodes("/employee/*").size());
//
//            XNode node = parser.evalNode("/employee/height");
//            System.out.println(node.getPath());
//            System.out.println(node.getValueBasedIdentifier());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
