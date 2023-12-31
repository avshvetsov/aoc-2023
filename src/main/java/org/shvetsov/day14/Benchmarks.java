package org.shvetsov.day14;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.shvetsov.day14.dany.Day14Task;
import org.shvetsov.utils.Utils;

import java.util.concurrent.TimeUnit;

import static org.shvetsov.InputAnswer.*;
import static org.shvetsov.InputAnswer.InputFormat.NAME;
import static org.shvetsov.InputAnswer.InputFormat.PATH;

//    Benchmark                   Mode  Cnt   Score   Error  Units
//    Benchmarks.day14part1Anton  avgt    3   0,439 ± 0,316  ms/op
//    Benchmarks.day14part1Dany   avgt    3  34,199 ± 1,375  ms/op
//    Benchmarks.day14part2Anton  avgt    3  49,335 ± 5,267  ms/op

@BenchmarkMode({Mode.AverageTime})
@Warmup(iterations = 2, time = 3)
@Measurement(iterations = 3, time = 3)
@Fork(0)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class Benchmarks {

    @Benchmark
    public void day14part1Anton(Blackhole bh) {
        bh.consume(new Day14().partOneAnton(Utils.parseInputByNewLine(DAY_14_PART_1_REAL_ANTON.getInput(PATH))));
    }

    @Benchmark
    public void day14part2Anton(Blackhole bh) {
        bh.consume(new Day14().partTwoAnton(Utils.parseInputByNewLine(DAY_14_PART_2_REAL_ANTON.getInput(PATH))));
    }

    @Benchmark
    public void day14part1Dany(Blackhole bh) {
        bh.consume(Day14Task.part1(Utils.parseInputDany(DAY_14_PART_1_REAL_DANY.getInput(NAME))));
    }
//
//    @Benchmark
//    public void day14part2Dany(Blackhole bh) {
//        bh.consume(Day14Task.part2(Utils.parseInputDany(DAY_14_PART_2_REAL_DANY.getInput(NAME))));
//    }

}
