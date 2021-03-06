package com.example.routing.model.result;

import com.example.routing.model.Station;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder(builderClassName = "Builder")
@Getter
public class ShortestRouteResult {
  private final List<Station> stations;
}
