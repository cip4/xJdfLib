
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermType")
@XmlSeeAlso({
    DurationEvaluation.class,
    DateTimeEvaluation.class,
    Test.class,
    BooleanEvaluation.class,
    And.class,
    PDFPathEvaluation.class,
    IntegerEvaluation.class,
    NameEvaluation.class,
    Or.class,
    NumberEvaluation.class,
    EnumEvaluation.class,
    RectangleEvaluation.class,
    XYPairEvaluation.class,
    ShapeEvaluation.class,
    StringEvaluation.class,
    Xor.class,
    TestRef.class,
    MatrixEvaluation.class,
    Not.class,
    IsPresentEvaluation.class
})
public abstract class TermType implements Serializable
{


}
