
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShapeCuttingIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShapeCuttingIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ShapeCut" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ShapeCuttingIntent", propOrder = {
    "shapeCuts"
})
public class ShapeCuttingIntent
    extends IntentType
    implements Serializable
{

    @XmlElement(name = "ShapeCut")
    protected List<ShapeCut> shapeCuts;

    /**
     * Gets the value of the shapeCuts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shapeCuts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShapeCuts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShapeCut }
     * 
     * 
     */
    public List<ShapeCut> getShapeCuts() {
        if (shapeCuts == null) {
            shapeCuts = new ArrayList<ShapeCut>();
        }
        return this.shapeCuts;
    }

}
