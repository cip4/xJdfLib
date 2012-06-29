
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShapeDefProductionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShapeDefProductionParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ObjectModel" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ShapeTemplate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShapeDefProductionParams", propOrder = {
    "shapeTemplates",
    "objectModels"
})
public class ShapeDefProductionParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ShapeTemplate")
    protected List<ShapeTemplate> shapeTemplates;
    @XmlElement(name = "ObjectModel")
    protected List<ObjectModel> objectModels;

    /**
     * Gets the value of the shapeTemplates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shapeTemplates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShapeTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShapeTemplate }
     * 
     * 
     */
    public List<ShapeTemplate> getShapeTemplates() {
        if (shapeTemplates == null) {
            shapeTemplates = new ArrayList<ShapeTemplate>();
        }
        return this.shapeTemplates;
    }

    /**
     * Gets the value of the objectModels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectModels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectModels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectModel }
     * 
     * 
     */
    public List<ObjectModel> getObjectModels() {
        if (objectModels == null) {
            objectModels = new ArrayList<ObjectModel>();
        }
        return this.objectModels;
    }

}
