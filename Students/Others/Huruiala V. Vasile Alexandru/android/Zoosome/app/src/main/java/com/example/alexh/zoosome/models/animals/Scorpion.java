package com.example.alexh.zoosome.models.animals;

import java.util.ArrayList;

/*
import static com.example.alexh.zoosome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import com.example.alexh.zoosome.services.factories.Constants;
*/
public class Scorpion extends Siege {
	private static final String DEFAULT_NAME = "Scorpion";
	private static final int DEFAULT_NUMBER_OF_LEGS = 2;
	private static final double DEFAULT_MAINTENANCE_COST = 2.5D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.25D;
	private static final int DEFAULT_RANGE = 300;
	private static final boolean DEFAULT_IS_MOBILE = true;

	public Scorpion() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFAULT_RANGE,
				DEFAULT_IS_MOBILE);
	}

	public Scorpion(final String animalName, final int numberOfLegs, final double maintenanceCost,
					final double dangerPerc, final int firingRange, final boolean mobile) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, firingRange, mobile);
	}

	public Scorpion(ArrayList<String> parameters) {
		super(parameters);
	}
	/*
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, String.valueOf(Constants.Animals.Sieges.SCORPION));
	}
	*/
}
