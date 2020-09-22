package com.younghun.hibusgo.service;

import com.younghun.hibusgo.domain.Route;
import com.younghun.hibusgo.mapper.RouteMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class RouteService {

  private final RouteMapper routeMapper;

  public boolean existsById(long id) {
    return routeMapper.existsById(id);
  }

  public List<Route> searchRoute(Route route) {
    return routeMapper.searchRoute(route);
  }

  public void addRoute(Route route) {
    routeMapper.addRoute(route);
  }

  public void updateRoute(Route route) {
    routeMapper.updateRoute(route);
  }

  public void deleteRoute(long id) {
    routeMapper.deleteRoute(id);
  }
}
