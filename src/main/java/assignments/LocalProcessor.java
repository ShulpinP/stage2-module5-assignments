package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import assignments.annotations.FullNameProcessorGeneratorAnnotation;
import assignments.annotations.ListIteratorAnnotation;
import assignments.annotations.ReadFullProcessorNameAnnotation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalProcessor {
    private String processorName;
    private Long period = 10_000_000_000_000L;
    private StringBuilder ProcessorVersion = new StringBuilder();
    private Integer valueofCheap = 0;
    private Scanner informationScanner;
    List<String> stringArrayList;

    public LocalProcessor(String processorName, Long period, String processorVersion, Integer valueOfCheap,
                          Scanner informationScanner, LinkedList<String> stringArrayList) {
        this.processorName = processorName;
        this.period = period;
        this.ProcessorVersion.append(processorVersion != null ? processorVersion : "");
        this.valueofCheap = valueOfCheap;
        this.informationScanner = informationScanner;
        this.stringArrayList = stringArrayList;
    }

    public LocalProcessor() {
    }

    @ListIteratorAnnotation
    public void listIterator(LinkedList<String> stringList) {
        for (String st: stringList) {
            System.out.println(st.hashCode());
        }
    }

    @FullNameProcessorGeneratorAnnotation
    public String fullNameProcessorGenerator(LinkedList<String> stringList) {
        StringBuilder sb = new StringBuilder();
        for (String st:stringList) {
            sb.append(st);
        }
        return sb.toString();
    }

    @ReadFullProcessorNameAnnotation
    public void readFullProcessorName(File file) throws FileNotFoundException {
            informationScanner = new Scanner(file);
            try {
                while (informationScanner.hasNext()) {
                    ProcessorVersion.append(informationScanner.nextLine());
                }
            } finally {
                informationScanner.close();
            }

    }
