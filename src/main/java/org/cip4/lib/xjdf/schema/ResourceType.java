
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceType">
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
@XmlType(name = "ResourceType")
@XmlSeeAlso({
    Ink.class,
    Employee.class,
    RegisterRibbon.class,
    DigitalMedia.class,
    ExposedMedia.class,
    Tool.class,
    UsageCounter.class,
    RollStand.class,
    Bundle.class,
    Strap.class,
    Pallet.class,
    PlaceHolderResource.class,
    Media.class,
    MiscConsumable.class,
    Device.class,
    Component.class
})
public class ResourceType implements Serializable
{


}