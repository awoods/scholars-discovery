package edu.tamu.scholars.middleware.view.model;

import static javax.persistence.EnumType.STRING;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "display_views")
public class DisplayView extends View {

    private static final long serialVersionUID = 7556127622115170597L;

    // TODO: add validation to prevent any given type belonging to multiple display views
    @ElementCollection
    private List<String> types;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String mainContentTemplate;

    @Column(columnDefinition = "TEXT")
    private String leftScanTemplate;

    @Column(columnDefinition = "TEXT")
    private String rightScanTemplate;

    @Column(columnDefinition = "TEXT")
    private String asideTemplate;

    @Enumerated(STRING)
    @Column(nullable = false)
    private Side asideLocation;

    @JoinColumn(name = "export_view_id")
    @OneToOne(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private ExportView exportView;

    @ElementCollection
    @MapKeyColumn(name = "name")
    @Column(name = "meta_template", columnDefinition = "TEXT")
    private Map<String, String> metaTemplates;

    @ElementCollection
    @MapKeyColumn(name = "name")
    @Column(name = "embed_template", columnDefinition = "TEXT")
    private Map<String, String> embedTemplates;

    @JoinColumn(name = "display_view_id")
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<DisplayTabView> tabs;

    public DisplayView() {
        super();
        types = new ArrayList<String>();
        metaTemplates = new HashMap<String, String>();
        embedTemplates = new HashMap<String, String>();
        tabs = new ArrayList<DisplayTabView>();
        asideLocation = Side.RIGHT;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getMainContentTemplate() {
        return mainContentTemplate;
    }

    public void setMainContentTemplate(String mainContentTemplate) {
        this.mainContentTemplate = mainContentTemplate;
    }

    public String getLeftScanTemplate() {
        return leftScanTemplate;
    }

    public void setLeftScanTemplate(String leftScanTemplate) {
        this.leftScanTemplate = leftScanTemplate;
    }

    public String getRightScanTemplate() {
        return rightScanTemplate;
    }

    public void setRightScanTemplate(String rightScanTemplate) {
        this.rightScanTemplate = rightScanTemplate;
    }

    public String getAsideTemplate() {
        return asideTemplate;
    }

    public void setAsideTemplate(String asideTemplate) {
        this.asideTemplate = asideTemplate;
    }

    public Side getAsideLocation() {
        return asideLocation;
    }

    public void setAsideLocation(Side asideLocation) {
        this.asideLocation = asideLocation;
    }

    public ExportView getExportView() {
        return exportView;
    }

    public void setExportView(ExportView exportView) {
        this.exportView = exportView;
    }

    public Map<String, String> getMetaTemplates() {
        return metaTemplates;
    }

    public void setMetaTemplates(Map<String, String> metaTemplates) {
        this.metaTemplates = metaTemplates;
    }

    public Map<String, String> getEmbedTemplates() {
        return embedTemplates;
    }

    public void setEmbedTemplates(Map<String, String> embedTemplates) {
        this.embedTemplates = embedTemplates;
    }

    public List<DisplayTabView> getTabs() {
        return tabs;
    }

    public void setTabs(List<DisplayTabView> tabs) {
        this.tabs = tabs;
    }

}
