
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntentType">
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
@XmlType(name = "IntentType")
@XmlSeeAlso({
    ScreeningIntent.class,
    ProductionIntent.class,
    LaminatingIntent.class,
    BindingIntent.class,
    ColorIntent.class,
    HoleMakingIntent.class,
    IntentResource.class,
    LayoutIntent.class,
    NumberingIntent.class,
    MediaIntent.class,
    ProofingIntent.class,
    PackingIntent.class,
    SizeIntent.class,
    PublishingIntent.class,
    EmbossingIntent.class,
    FoldingIntent.class,
    InsertingIntent.class,
    ShapeCuttingIntent.class
})
public class IntentType implements Serializable
{


}
