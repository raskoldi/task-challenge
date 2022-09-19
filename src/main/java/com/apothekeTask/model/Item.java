package com.apothekeTask.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Item {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("description")
    private String description;
    @JsonProperty("fork")
    private Boolean fork;
    @JsonProperty("url")
    private String url;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("pushed_at")
    private String pushedAt;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("stargazers_count")
    private Integer stargazersCount;
    @JsonProperty("watchers_count")
    private Integer watchersCount;
    @JsonProperty("language")
    private String language;
    @JsonProperty("forks_count")
    private Integer forksCount;
    @JsonProperty("open_issues_count")
    private Integer openIssuesCount;
    @JsonProperty("master_branch")
    private String masterBranch;
    @JsonProperty("default_branch")
    private String defaultBranch;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("archive_url")
    private String archiveUrl;
    @JsonProperty("assignees_url")
    private String assigneesUrl;
    @JsonProperty("blobs_url")
    private String blobsUrl;
    @JsonProperty("branches_url")
    private String branchesUrl;
    @JsonProperty("collaborators_url")
    private String collaboratorsUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("commits_url")
    private String commitsUrl;
    @JsonProperty("compare_url")
    private String compareUrl;
    @JsonProperty("contents_url")
    private String contentsUrl;
    @JsonProperty("contributors_url")
    private String contributorsUrl;
    @JsonProperty("deployments_url")
    private String deploymentsUrl;
    @JsonProperty("downloads_url")
    private String downloadsUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("forks_url")
    private String forksUrl;
    @JsonProperty("git_commits_url")
    private String gitCommitsUrl;
    @JsonProperty("git_refs_url")
    private String gitRefsUrl;
    @JsonProperty("git_tags_url")
    private String gitTagsUrl;
    @JsonProperty("git_url")
    private String gitUrl;
    @JsonProperty("issue_comment_url")
    private String issueCommentUrl;
    @JsonProperty("issue_events_url")
    private String issueEventsUrl;
    @JsonProperty("issues_url")
    private String issuesUrl;
    @JsonProperty("keys_url")
    private String keysUrl;
    @JsonProperty("labels_url")
    private String labelsUrl;
    @JsonProperty("languages_url")
    private String languagesUrl;
    @JsonProperty("merges_url")
    private String mergesUrl;
    @JsonProperty("milestones_url")
    private String milestonesUrl;
    @JsonProperty("notifications_url")
    private String notificationsUrl;
    @JsonProperty("pulls_url")
    private String pullsUrl;
    @JsonProperty("releases_url")
    private String releasesUrl;
    @JsonProperty("ssh_url")
    private String sshUrl;
    @JsonProperty("stargazers_url")
    private String stargazersUrl;
    @JsonProperty("statuses_url")
    private String statusesUrl;
    @JsonProperty("subscribers_url")
    private String subscribersUrl;
    @JsonProperty("subscription_url")
    private String subscriptionUrl;
    @JsonProperty("tags_url")
    private String tagsUrl;
    @JsonProperty("teams_url")
    private String teamsUrl;
    @JsonProperty("trees_url")
    private String treesUrl;
    @JsonProperty("clone_url")
    private String cloneUrl;
    @JsonProperty("mirror_url")
    private String mirrorUrl;
    @JsonProperty("hooks_url")
    private String hooksUrl;
    @JsonProperty("svn_url")
    private String svnUrl;
    @JsonProperty("forks")
    private Integer forks;
    @JsonProperty("open_issues")
    private Integer openIssues;
    @JsonProperty("watchers")
    private Integer watchers;
    @JsonProperty("has_issues")
    private Boolean hasIssues;
    @JsonProperty("has_projects")
    private Boolean hasProjects;
    @JsonProperty("has_pages")
    private Boolean hasPages;
    @JsonProperty("has_wiki")
    private Boolean hasWiki;
    @JsonProperty("has_downloads")
    private Boolean hasDownloads;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("disabled")
    private Boolean disabled;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("license")
    private License license;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
