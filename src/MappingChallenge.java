import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


class MappingChallenge {

    private final DataFiles mapFile;

    public MappingChallenge(DataFiles mapFile) {
        this.mapFile = mapFile;
    }

    public Map<Integer, String> mappings() {
        BufferedReader FileToMap = mapFile.getMappingReader();
        Map<Integer, String> resultMap = new HashMap<Integer, String>();
        TreeMap<Integer, String> sorted = new TreeMap<>();
        String line;
        try {
            while ((line = FileToMap.readLine()) != null) {
                String[] str = line.split(",");
                resultMap.put(Integer.parseInt(str[0]), str[1]);
            }
            sorted.putAll(resultMap);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return sorted;
    }

    public void process(BufferedReader dataToMap) {
        String line;
        Set<Map.Entry<Integer, String>> thisSet = mappings().entrySet();
        int size = mappings().entrySet().size();
        Map.Entry<Integer, String>[] entryArray = thisSet.toArray(new Map.Entry[thisSet.size()]);

        try {
            while ((line = dataToMap.readLine()) != null) {
                int counter = 0;
                for (Map.Entry<Integer, String> entry : entryArray) {
                    Integer currLine = Integer.parseInt(line);

                    if (counter + 1 == size) {
                        System.out.println(getRangeName(currLine, entry.getValue()));
                        break;
                    }
                    if (currLine >= entry.getKey() && currLine < entryArray[counter + 1].getKey()) {
                        System.out.println(getRangeName(currLine, entry.getValue()));
                        break;
                    }
                    counter += 1;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getRangeName(int mappedNum, String mappedVal) {

        return String.format("%s maps to:  '%s'", mappedNum, mappedVal);

    }

}

/**
 * APPLICATION ENTRY POINT
 * Press Coderpad's Run button to call main(String[] args)
 */
class Solution {
    public static void main(String[] args) {
        DataFiles data = new DataFiles();
        // data.printMappingFile("Mapping.csv");
        // data.printMappingFile("DataToProcess.csv");

        MappingChallenge mapper = new MappingChallenge(data);

        mapper.process(data.getDataToProcessReader());

        System.out.println(mapper.mappings());

    }

}
