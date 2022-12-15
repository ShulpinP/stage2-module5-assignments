package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
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
    protected String ProcessorVersion;
    private Integer valueofCheap;
    private Scanner informationscanner;
    LinkedList<String> stringArrayList = new LinkedList<>();

    public LocalProcessor(String processorName, Long period, String processorVersion, Integer valueOfCheap,
                          Scanner informationscanner, LinkedList<String> stringArrayList) {
        this.processorName = processorName;
        this.period = period;
        ProcessorVersion = processorVersion;
        this.valueofCheap = valueOfCheap;
        this.informationscanner = informationscanner;
        this.stringArrayList = stringArrayList;
    }

    public LocalProcessor() {
    }

    @ListIteratorAnnotation
    public void listiterator(LinkedList<String> stringList) {
        stringArrayList = new LinkedList<>(stringList);
        for (int i = 0; i < period; i++) {
            System.out.println(stringArrayList.get(i).hashCode());
        }
    }

    @FullNameProcessorGeneratorAnnotation
    public String fullnameProcessorgenerator(LinkedList<String> stringList) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringArrayList.size(); i++) {
            sb.append(stringList.get(i));
        }
        return sb.toString();
    }

    @ReadFullProcessorNameAnnotation
    public void readfullprocessorname(File file) throws FileNotFoundException {
            StringBuilder sb = new StringBuilder();
            informationscanner = new Scanner(file);
            while (informationscanner.hasNext()) {
                sb.append(informationscanner.nextLine());
            }
            ProcessorVersion = sb.toString();

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
