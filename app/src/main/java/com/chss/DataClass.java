package com.chss;

import java.util.ArrayList;
import java.util.HashMap;

import za.co.chss.client.entities.Patient;

class DataClass {
    public static final int PATIENT_CREATION = 0;

    public static ArrayList<Patient> getPatientList() {
        ArrayList<Patient> list = new ArrayList<>();

        list.add(new Patient("aa","ab","ac","ad",0,"ae","af","ag","ah",null));
        list.add(new Patient("ba","bb","bc","bd",0,"be","bf","bg","bh",null));
        list.add(new Patient("ca","cb","cc","cd",0,"ce","cf","cg","ch",null));
        list.add(new Patient("daa","dab","dac","dad",0,"dae","daf","dag","dah",null));
        list.add(new Patient("eaa","eab","eac","ead",0,"eae","eaf","eag","eah",null));
        list.add(new Patient("faa","fab","fac","fad",0,"fae","faf","fag","fah",null));
        list.add(new Patient("gaa","gab","gac","gad",0,"gae","gaf","gag","gah",null));
        list.add(new Patient("haa","hab","hac","had",0,"hae","haf","hag","hah",null));
        list.add(new Patient("iaa","iab","iac","iad",0,"iae","iaf","iag","iah",null));
        list.add(new Patient("jaa","jab","jac","jad",0,"jae","jaf","jag","jah",null));
        list.add(new Patient("kaa","kab","kac","kad",0,"kae","kaf","kag","kah",null));
        list.add(new Patient("jaa","jab","jac","jad",0,"jae","jaf","jag","jah",null));
        list.add(new Patient("laa","lab","lac","lad",0,"lae","laf","lag","lah",null));
        list.add(new Patient("maa","mab","mac","mad",0,"mae","maf","mag","mah",null));
        list.add(new Patient("naa","nab","nac","nad",0,"nae","naf","nag","nah",null));
        list.add(new Patient("oaa","oab","oac","oad",0,"oae","oaf","oag","oah",null));
        list.add(new Patient("paa","pab","pac","pad",0,"pae","paf","pag","pah",null));
        list.add(new Patient("qaa","qab","qac","qad",0,"qae","qaf","qag","qah",null));
        list.add(new Patient("raa","rab","rac","rad",0,"rae","raf","rag","rah",null));

        return list;
    }

    public static boolean createPatient(Patient patient) {

        return true;
    }

    public static boolean addEvaluation(HashMap<String, String> evaulation) {

        return true;
    }
}