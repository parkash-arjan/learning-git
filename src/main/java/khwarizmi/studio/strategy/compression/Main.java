package khwarizmi.studio.strategy.compression;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

public class Main {

  public static void main(String[] args) throws IOException {
    Path inFile = Paths.get("inFile.txt");
    File outFile = new File("outFile.txt");
    Compressor gzipCompressor = new Compressor(new GzipCompressionStrategy());
    gzipCompressor.compress(inFile, outFile);
    Compressor zipCompressor = new Compressor(new ZipCompressionStrategy());
    zipCompressor.compress(inFile, outFile);
  }

  public static void lambdaMain() throws IOException {
    Path inFile = Paths.get("inFile.txt");
    File outFile = new File("outFile.txt");

    Compressor gzipCompressor = new Compressor(GZIPOutputStream::new);
    gzipCompressor.compress(inFile, outFile);

    Compressor zipCompressor = new Compressor(ZipOutputStream::new);
    zipCompressor.compress(inFile, outFile);
  }
}
