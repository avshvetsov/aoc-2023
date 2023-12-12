package org.shvetsov.day5;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.shvetsov.Utils;

import java.util.concurrent.TimeUnit;

@BenchmarkMode({Mode.AverageTime})
@Warmup(iterations = 2, time = 5)
@Measurement(iterations = 3, time = 10)
@Fork(0)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class Benchmarks {

//    @Benchmark
//    public void day4part1Anton(Blackhole bh) {
//        bh.consume(new Day5().partOneAnton(Utils.parseInputByNewLine(Day5.INPUT_PATH)));
//    }
//
//    @Benchmark
//    public void day4part2Anton(Blackhole bh) {
//        bh.consume(new Day5().partTwoAnton(Utils.parseInputByNewLine(Day5.INPUT_PATH)));
//    }

    @Benchmark
    public void day5part1Dany(Blackhole bh) {
        bh.consume(Day5Dany.part1(Utils.parseInputDany(Day5Dany.INPUT_NAME)));
    }

    @Benchmark
    public void day5part2Dany(Blackhole bh) {
        bh.consume(Day5Dany.part2(Utils.parseInputDany(Day5Dany.INPUT_NAME)));
    }

}
