//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.14 at 01:52:08 PM MESZ 
//


package org.osm.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Osm_changeset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Osm_changeset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tag" type="{}Osm_tag" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="created_at" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="open" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="min_lat" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="min_lon" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="max_lat" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="max_lon" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Osm_changeset", propOrder = {
    "tag"
})
public class OsmChangeset {

    protected List<OsmTag> tag;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlAttribute(name = "created_at")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlAttribute(name = "open")
    protected Boolean open;
    @XmlAttribute(name = "user")
    protected String user;
    @XmlAttribute(name = "min_lat")
    protected Float minLat;
    @XmlAttribute(name = "min_lon")
    protected Float minLon;
    @XmlAttribute(name = "max_lat")
    protected Float maxLat;
    @XmlAttribute(name = "max_lon")
    protected Float maxLon;

    /**
     * Gets the value of the tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OsmTag }
     * 
     * 
     */
    public List<OsmTag> getTag() {
        if (tag == null) {
            tag = new ArrayList<OsmTag>();
        }
        return this.tag;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the open property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpen(Boolean value) {
        this.open = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the minLat property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinLat() {
        return minLat;
    }

    /**
     * Sets the value of the minLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinLat(Float value) {
        this.minLat = value;
    }

    /**
     * Gets the value of the minLon property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinLon() {
        return minLon;
    }

    /**
     * Sets the value of the minLon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinLon(Float value) {
        this.minLon = value;
    }

    /**
     * Gets the value of the maxLat property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxLat() {
        return maxLat;
    }

    /**
     * Sets the value of the maxLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxLat(Float value) {
        this.maxLat = value;
    }

    /**
     * Gets the value of the maxLon property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxLon() {
        return maxLon;
    }

    /**
     * Sets the value of the maxLon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxLon(Float value) {
        this.maxLon = value;
    }

}
