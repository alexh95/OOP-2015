package com.example.alexh.zoosome.models.animals;
/*
import static com.example.alexh.zoosome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
*/
import com.example.alexh.zoosome.services.factories.Constants;

import java.util.ArrayList;

public class Mangonel extends Siege {
	private static final String DEFAULT_NAME = "Mangonel";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final double DEFAULT_MAINTENANCE_COST = 3.5D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.125D;
	private static final int DEFAULT_RANGE = 110;
	private static final boolean DEFAULT_IS_MOBILE = true;

	public Mangonel() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFAULT_RANGE,
				DEFAULT_IS_MOBILE);
	}

	public Mangonel(final String animalName, final int numberOfLegs, final double maintenanceCost,
			final double dangerPerc, final int firingRange, final boolean mobile) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, firingRange, mobile);
	}

	public Mangonel(ArrayList<String> parameters) {
		super(parameters);
	}
/*
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, String.valueOf(Constants.Animals.Sieges.MANGONEL));
	}*/
}
